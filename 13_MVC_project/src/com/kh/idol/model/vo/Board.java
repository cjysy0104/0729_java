package com.kh.idol.model.vo;

import java.util.Objects;

public class Board {

	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String userId;
	private String createDate;
	/*
	 * 제목 내용 작성자 작성일 + 글식별번호
	 */

	public Board() {
		super();
	}

	public Board(int boardNo, String boardTitle, String boardContent, String userId, String createDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.userId = userId;
		this.createDate = createDate;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", userId=" + userId + ", createDate=" + createDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(boardContent, boardNo, boardTitle, createDate, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		return Objects.equals(boardContent, other.boardContent) && boardNo == other.boardNo
				&& Objects.equals(boardTitle, other.boardTitle) && Objects.equals(createDate, other.createDate)
				&& Objects.equals(userId, other.userId);
	}

}
