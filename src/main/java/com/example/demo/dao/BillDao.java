package com.example.demo.dao;

import com.example.demo.dto.BillDetailsDto;
import com.example.demo.dto.BillHistoryDto;
import com.example.demo.dto.ReviewDto;
import com.example.demo.entity.Bill;
import com.example.demo.model.RateAndReviewBillModel;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface BillDao {
	@Select
	Bill findById(Integer id);
	
	@Select
	List<BillHistoryDto> getBillHistory(Integer customerId, Integer pageSize, Integer page);

	@Select
	BillDetailsDto getBillDetails(Integer billId, Integer customerId);
	
	@Select
	BillDetailsDto findBillDetailsByQrCode(String qrCode);
	
	@Insert
	int insert(Bill bill);

	@Update(sqlFile = true)
	int updateRateAndReview(RateAndReviewBillModel model);

	@Select
	List<Bill> findByMovie(String id);

	@Update(sqlFile = true)
	int updateExportStatus(Integer id, Integer exportstatus);
	
	@Update(sqlFile = true)
	int updateTotalPrice(int id, double totalPrice);
	
	@Select
	BillDetailsDto checkout(Integer billId, Integer customerId);

	@Select
	List<ReviewDto> getReviewByMovieId(String id, Integer pageSize, Integer page);

	@Select
	Integer getTotalReviewByMovieId(String id);
	
	@Update(sqlFile = true)
	int updateQrCode(int id, String qrCode);
	
	@Select
	Integer getTotalBillHistory(Integer customerId);
}
