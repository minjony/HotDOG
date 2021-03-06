package com.ybm.hotdog.board.parcel.service;

import java.util.List;

import com.ybm.hotdog.board.domain.ArticleDTO;
import com.ybm.hotdog.board.domain.ReplyDTO;

public interface BoardParcelService {

	/** 게시글 목록 전체 조회 */
	public List<ArticleDTO> listAll(String searchOption, String keyword, int start, int end);

	/** 검색 게시글 전체 수 */
	public int searchCount(String searchOption, String keyword);

	/** 댓글 전체 조회 */
	public List<ReplyDTO> listReply(int articleNo);

	/** 게시글 상세 내용 조회 */
	public ArticleDTO getArticle(int articleNo);

	/** 게시글 저장 */
	public void articleInsert(ArticleDTO articleDTO);

	/** 답글 구조 */
	public void replyView(int group, int order);

	/** 답글 저장 */
	public void articleReplyInsert(ArticleDTO articleDTO);

	/** 댓글 저장 */
	public void replyInsert(ReplyDTO replyDTO);

	/** 게시글 수정 */
	public void articleUpdate(ArticleDTO articleDTO);

	/** 게시글 삭제 */
	public void articleDelete(int articleNo);

	/** 게시글 조회수 증가 */
	public void increaseHitCount(int articleNo);


}
