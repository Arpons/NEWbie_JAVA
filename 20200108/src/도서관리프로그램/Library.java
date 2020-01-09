package 도서관리프로그램;

import java.util.ArrayList;

public class Library {
	private ArrayList<idVO> idList;
	private ArrayList<bookVO> bookList;
	private boolean check;

	public Library(ArrayList<idVO> idList, ArrayList<bookVO> bookList) {
		this.idList = idList;
		this.bookList = bookList;
	}

	public boolean join(String id, String password) {
		for (int i = 0; i < idList.size(); i++) {
			if (idList.get(i).getId() != null) {
				if (idList.get(i).getId().equals(id)) {
					check = false;
					return check;
				}
			} else {
				idList.add(new idVO(id, password));
				check = true;
				return check;
			}
		}
		idList.add(new idVO(id, password));
		check = true;
		return check;
	}

	public boolean Login(String id, String password) {

		for (int i = 0; i < idList.size(); i++) {
			if (idList.get(i).getId().equals(id) && idList.get(i).getPassword().equals(password)) {
				check = true;
			} else {
				check = false;
			}
		}
		return check;
	}

	public boolean getCheck() {
		return check;
	}

	public boolean borrowbook(int bookNumber, String id) {
		if(bookList.get(bookNumber).getId().equals("")) {
			bookList.get(bookNumber).setId(id);
			check = true;
			
		} else {
			check = false;
		}
		return check;

	}

	public void returnBook(int bookNumber) {
		bookList.get(bookNumber).setId("");
		
		
	}

}
