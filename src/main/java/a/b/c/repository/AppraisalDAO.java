package a.b.c.repository;

import java.util.List;

import a.b.c.model.AllCommentCmd;
import a.b.c.model.AppraisalVO;
import a.b.c.model.BookShelfVO;
import a.b.c.model.DeleteCmd;
import a.b.c.model.UpdateCmd;

public interface AppraisalDAO {
	void writeComment(AppraisalVO appraisal);	//평가 작성
	BookShelfVO insertBookShelf(BookShelfVO bookShelf);	//독서 상태 삽입
	List<AllCommentCmd> findAllComment(String isbn);	//해당 도서의 대한 모든 평가 호출
	int commentCount(String isbn);	//해당 도서의 대한 코멘트 개수 호출
	BookShelfVO selectBookShelf(BookShelfVO bookShelf);	//독서 상태 호출
	void updateComment(UpdateCmd updateComment);	//평가 수정
	void deleteComment(DeleteCmd deleteCmd);	//평가 삭제
}
