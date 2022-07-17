import java.util.*;

class Students implements Comparable<Students>{
	private String name;
	private int score;
	
	public Students(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	@Override
	public int compareTo(Students o) {
		if(this.score<o.score) {
			return -1;
		}
		return 1;
	}
}

public class printStudent  {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Students> arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			String name = sc.next();
			int score= sc.nextInt();
			arr.add(new Students(name, score));
		}
		
		Collections.sort(arr);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr.get(i).getName()+ " ");
		}
		

	}

}
