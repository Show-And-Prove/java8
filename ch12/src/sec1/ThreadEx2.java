package sec1;
// 비선점형 : 쓰레드객체.run()
// 선점형 : 쓰레드객체.start()
// 쓰레드 주기설정 : Thread.sleep()
// 쓰레드 우선순위 설정 : 쓰레드객체.setPriority()
// 쓰레드 우선순위 값 가져오기 : 쓰레드객체.getPriority()
// 쓰레드의 상태 
//
// 생성(New Thread) : Create -> 실행 대기(new Runnable) : Wait ->실행(
// -> 선점(blocking=preemption) -> 대기(sleep() ) : wait -> 재실행(run () : Wake Up)
// -> 정상종료(Interrupt) : Terminated
public class ThreadEx2 {
	public static void main(String[] args){
		Thread th1 = new Thread(new ThreadWithRunnable());
		Thread th2 = new Thread(new ThreadWithRunnable());
		
		
		
		// 쓰레드의 우선순위 변경
		th2.setPriority(10);
		
		th1.start();
		th2.start();
		
		System.out.println("th1의 우선순위 : " + th1.getPriority());
		System.out.println("th2의 우선순위 : " + th2.getPriority());	
	}
}
