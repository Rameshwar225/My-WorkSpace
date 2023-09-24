package CoreJava;


class DoorL
{
	public boolean isLock(String key)
	{
		class LockL
		{
			public boolean isLocked(String key)
			{
				if(key.equals("abc"))
				{
					return false;
				}
				else {
					return true;
				}
			}
		}
		return new LockL().isLocked(key);
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		
		DoorL d1 = new DoorL();
		System.out.println(d1.isLock("pqr"));

	}

}
