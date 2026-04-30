package com.example.chapter15;

public class ThreadingExercise {

	public static void main(String[] args) {
		//問１
		System.out.println("問１");
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		//スレッドが別で動いているのを確認用にmainでも動かす
		runnable.run();

		//問２
		//カウンターを呼び出す
		Counter counter = new Counter();
		//カウンタータスクにカウンターで実行するように伝える
		CountTask count = new CountTask(counter);
		//スレッドに実行するカウンターを呼ぶ
		Thread threadCount1 = new Thread(count);
		Thread threadCount2 = new Thread(count);
		threadCount1.start();
		threadCount2.start();
		/* *
		 * スレッドが終わるまで待つ！
		 * その時は、mainがスレッドの処理に割り込まれると、
		 * joinは待機状態を中断されて
		 * InterruptedException(中断例外)を起こす
		 * */
		try {
			threadCount1.join();
			threadCount2.join();
		} catch (InterruptedException e) {
			//どこで処理が中断されているか(=例外発生場所)を出力するもの
			e.printStackTrace();
		}
		//実行結果
		System.out.println(counter.getCount());
	}

}

//問１
class MyRunnable implements Runnable {
	@Override
	public void run() {
		//別スレッドがわかるように表示
		System.out.println("Hello from a thread!" + Thread.currentThread().getName());
	}
}

//問２
class Counter {
	private int count = 0;

	synchronized public int increment() {
		count++;
		return count;
	}

	public int getCount() {
		return count;
	}
}

class CountTask implements Runnable {

	private Counter counter;

	/* *
	 * カウンターするときのオブジェクト花に使うのを指定
	 * (ここではCounterクラスが該当)
	 * */
	public CountTask(Counter counter) {
		this.counter = counter;
	}

	/* *
	 * 10回インクリメントを動かす
	 * このcounterはクラスCounterのものなので、incrementが動く
	 * かつ、このincrementはsynchronizedされているので
	 * 何回呼び出されても終わるまで待っててくれる
	 * */
	@Override
	public void run() {
		//ちょっと長めに設定(普通なら処理がかぶるように)
		for (int i = 0; i < 10000; i++) {
			counter.increment();
		}
	}
}
