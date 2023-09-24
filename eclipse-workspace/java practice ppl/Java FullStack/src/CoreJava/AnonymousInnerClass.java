package CoreJava;


 class DoorA{
	private LockA lock = new LockA(){
 
		public boolean isUnlocked(String keyCode) {
			if(keyCode.equals("qwerty")){
				return true;
			}else{
				return false;
			}
		}

		
		
	};
	public LockA getLock() {
		return lock;
	}
	
}
 abstract class LockA
{
	public abstract boolean isUnlocked(String key);
	
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		DoorA door = new DoorA();
		
		System.out.println(door.getLock().isUnlocked("pqr"));

	}

}
