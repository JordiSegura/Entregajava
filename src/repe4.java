import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.SingleSelectionModel;

public class repe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Jordi";
		/*System.out.println(Stream.generate(() -> str + System.lineSeparator()).limit(100).collect(Collectors.toList()));
		Pro way*/
		for(int i=0;i<100;i++){
			System.out.println("Jordi");
		}
		

		//repeated.equals("abcabcabc");

	}

}
