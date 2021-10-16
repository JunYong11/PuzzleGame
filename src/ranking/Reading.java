package ranking;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

// �� ���ξ� �޸��� ����

public class Reading {

	static ArrayList<Userdata> userlist = new ArrayList<Userdata>();

	public static void readFileAddList(String filePath) {
		try {

			try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
				while (true) {

					@SuppressWarnings("deprecation")
					String text = dis.readLine();
					// �ؽ�Ʈ ���� �� �����͸� �� �� �� ����

					// ���� �ݺ� ������ ���� ���� �ؽ�Ʈ �� �����Ͱ� ������ ��������
					if (text == null) {
						break;
					}

					String[] strArray = text.split(","); // comma�� �������� �ڸ���

					userlist.add(new Userdata(strArray[0], Integer.valueOf(strArray[1])));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ���� ���
	public static void printUserList() {
		for (Userdata userdata : userlist) {
			System.out.println(userdata);
		}
		System.out.println("");
	}

}
