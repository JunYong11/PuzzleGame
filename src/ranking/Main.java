package ranking;

import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		System.out.println("main method start");
		// �Ʒ��� �޼ҵ带 �̿��� �� ������ �ؽ�Ʈ���Ͽ� ���� �� �ִ�.
		// Writing.write();
		Reading.readFileAddList(Properties.filePath);

		System.out.println("���� ��(�ؽ�Ʈ���Ͽ� �Էµ� ��) ->");
		Reading.printUserList();
		Collections.sort(Reading.userlist, new UserComparator());
		System.out.println("���� ��(��������)->");
		Reading.printUserList();

		// ��� ����Ʈ�� ���� ��ҿ� �����ϰ� �ʹٸ� �Ʒ��� �̿�.
		System.out.println("���� ������ ���� ������ �����ʹ� �Ʒ��� ����");
		System.out.println(Reading.userlist.get(0).getName());
		System.out.println(Reading.userlist.get(0).getScore());

		System.out.println("main method end");
	}
}