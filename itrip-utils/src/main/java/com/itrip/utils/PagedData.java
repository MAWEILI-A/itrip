package com.itrip.utils;

import java.util.List;

public class PagedData<T> {

	public PagedData(int pageIndex, int pageSize, int totalCount, List<T> list) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.list = list;
		this.totalPageCount = totalCount % pageSize == 0 ? totalCount / pageSize
				: totalCount / pageSize + 1;
	}

	private int pageIndex;
	private int pageSize;
	private int totalCount;
	private int totalPageCount;
	private boolean hasPrevious;
	private boolean hasNext;
	private List<T> list;

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public boolean isHasPrevious() {
		return this.pageIndex > 1;
	}

	public boolean isHasNext() {
		return this.pageIndex < this.totalPageCount;
	}

}
