package ranking;

import java.io.File;
import java.io.FileWriter;

// Writing.write(); �� ���� �޼ҵ忡 �Ἥ �ؽ�Ʈ�� �����Ѵ�.
public class Writing {
	// Userdata ��ü �������� �̸��� ������ �ٸ� Ŭ������ �޼ҵ带 �޾ƿ´�.
	// ������ �ӽ÷� ������ �����͸� �����ص� ���´�
	static Userdata A = new Userdata("Name", 9999);
	static String txt1 = A.getName();
	static String txt2 = ",";
	static String txt3 = String.valueOf(A.getScore());
	static String txt4 = "\n";

	static void write() {
		try {
			// ���� ��ü ����
			File file = new File(Properties.filePath);

			// true ������ ������ ���� ���뿡 �̾ �ۼ�
			FileWriter fw = new FileWriter(file, true);

			// ���Ͼȿ� ���ڿ� ����
			fw.write(txt1);
			fw.write(txt2);
			fw.write(txt3);
			fw.write(txt4);
			fw.flush();

			// ��ü �ݱ�
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
