package ourbox.notice.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import ourbox.common.vo.NoticeVO;

public interface INoticeService {
		
		/**
		 * 공지사항의 목록을 가져오는 메서드
		 * @return 전체 NoticeVO객체를 담고있는 List객체
		 */
		public List<NoticeVO> noticeList();
		
		/**
		 * NoticeVO에 담겨진 자료를 DB에 insert하는 메서드
		 * @param notice DB에 insert할 자료가 저장된 NoticeVO 객체
		 * @return 작업성공 : 1, 작업실패 : 0
		 */
		public int insertNotice(NoticeVO notice);
		
		/**
		 * 하나의 NoticeVO 자료를 이용하여 DB를 update하는 메서드
		 * @param notice update할 공지의 정보가 들어있는 NoticeVO객체
		 * @return 작업성공 : 1, 작업실패 : 0
		 */
		public int updateNotice(NoticeVO notice);
		
		/**
		 * 공지사항의 번호를 매개변수로 받아서 그 공지사항을 삭제하는 메서드
		 * @param notice_seq 삭제할 공지사항의 번호
		 * @return 작업성공 : 1, 작업실패 : 0
		 */
		public int deleteNotice(int notice_seq);
		
		/**
		 * 해당하는 번호의 NoticeVO 객체를 반환하는 메서드
		 * @param notice_seq 세부내용을 볼 notice의 번호
		 * @return 번호에 해당하는 NoticeVO객체
		 */
		public NoticeVO detailNotice(int notice_seq);
		
		/**
		 * NoticeVO에 담긴 자료를 이용하여 공지사항을 검색하는 메서드
		 * @param notice 검색할 자료가 들어있는 NoticeVO 객체
		 * @return 검색된 NoticeVO객체를 담은 List객체
		 */
		public List<NoticeVO> searchNotice(NoticeVO notice);
		
		/**
		 * 해당하는 페이지의 notice객체를 가져오는 메서드
		 * @param map 원하는 페이지 구성의 정보가 담긴 맵
		 * @return 해당하는 페이지의 noticeList
		 */
		public List<NoticeVO> selectPage(Map<String, Integer> map);
		
		/**
		 * 전체 notice의 갯수를 가져오는 메서드
		 * @return notice의 갯수
		 */
		public int getTotalCount();
		
		
		
}
