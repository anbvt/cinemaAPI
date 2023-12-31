package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enums.RequestParameterEnum;
import com.example.demo.dao.DashboardDao;
import com.example.demo.dto.TicketInDayDto;
import com.example.demo.entity.Dashboard;
import com.example.demo.exception.InvalidRequestParameterException;

@Service
public class DashboardService {
	@Autowired
	private DashboardDao dashboardDao;

	public List<Dashboard> findTotalPriceTicketPerMonthOfYear(int year, String branchId)
			throws InvalidRequestParameterException {
		List<Dashboard> list = dashboardDao.findTotalPriceTicketPerMonthOfYear(year, branchId);
		if (list.size() <= 0) {
			throw new InvalidRequestParameterException("Thống kê", RequestParameterEnum.NOT_FOUND);
		}
		return list;
	}

	public List<Dashboard> statisticsTicketPriceByMovie(String branchId) throws InvalidRequestParameterException {
		List<Dashboard> list = dashboardDao.statisticsTicketPriceByMovie(branchId);
		if (list.size() <= 0) {
			throw new InvalidRequestParameterException("Thống kê", RequestParameterEnum.NOT_FOUND);
		}
		return list;
	}

	public List<Dashboard> statisticsTicketPriceByMovie2(String movieId, int year, String branchId)
			throws InvalidRequestParameterException {
		List<Dashboard> list = dashboardDao.statisticsTicketPriceByMovie2(movieId, year, branchId);
		if (list.size() <= 0) {
			throw new InvalidRequestParameterException("Thống kê", RequestParameterEnum.NOT_FOUND);
		}
		return list;
	}

	public List<Dashboard> fillYear() {
		return dashboardDao.fillYear();
	}

	public List<Dashboard> statisticsTicketPriceByMovieForDay(String movieId, String date, String branchId) throws InvalidRequestParameterException {
		List<Dashboard> list = dashboardDao.statisticsTicketPriceByMovieForDay(movieId, date, branchId);
		if(list.size()<=0) {
			throw new InvalidRequestParameterException("Thống kê", RequestParameterEnum.NOT_FOUND);
		}
		return list;
	}

	public List<Dashboard> statisticsTicketPriceByMovieFromDate(String movieId, String startDate, String endDate,
			String branchId) throws InvalidRequestParameterException {
		List<Dashboard> list = dashboardDao.statisticsTicketPriceByMovieFromDate(movieId, startDate, endDate, branchId);
		if(list.size()<=0) {
			throw new InvalidRequestParameterException("Thống kê", RequestParameterEnum.NOT_FOUND);
		}
		return list;
	}

	public List<Dashboard> MovieOfBranch(String branchId) throws InvalidRequestParameterException {
		List<Dashboard> list = dashboardDao.MovieOfBranch(branchId);
		if(list.size()<=0) {
			throw new InvalidRequestParameterException("Thống kê", RequestParameterEnum.NOT_FOUND);
		}
		return list;
	}

	public List<Dashboard> statisticsTotalShowtimeOfYear(int year, String branchId) throws InvalidRequestParameterException {
		List<Dashboard> list = dashboardDao.statisticsTotalShowtimeOfYear(year, branchId);
		if(list.size()<=0) {
			throw new InvalidRequestParameterException("Thống kê", RequestParameterEnum.NOT_FOUND);
		}
		return list;
	}

	public List<TicketInDayDto> statisticsTotalTicketInDay(String movieId, String branchId) {
		return dashboardDao.statisticsTotalTicketInDay(movieId, branchId);
	}
}
