package com.lol.tracer.web;

import java.util.List;

import com.lol.tracer.model.Target;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lol.tracer.service.TargetService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags="TargetApi")
public class TargetController {

	@Autowired
	TargetService targetService;
	
	@RequestMapping(value = "/targets", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation("타겟 등록")
	public ResponseEntity<?> registTarget(@RequestParam String name, @RequestParam String summonerName) {
		
		try {
			Target target = targetService.registTarget(name, summonerName);
			
			if (target != null) {
				return new ResponseEntity<Target>(target,HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}	
	
	/**
	 * 등록된 소환사 리스트
	 * @return
	 */
	@RequestMapping(value = "/targets", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation("타겟 목록")
	public ResponseEntity<?> targetList() {
		
		try {
			List<Target> targets = targetService.getTargets();
			return new ResponseEntity<List<Target>>(targets,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
//	/**
//	 * 타겟 상세 정보
//	 * @param targetNo
//	 * @return
//	 */
//	@RequestMapping(value = "/targets/{targetNo}", method = RequestMethod.GET)
//	@ResponseBody
//	@ApiOperation("타겟 상세정보")
//	public ResponseEntity<?> userInfo(@PathVariable long targetNo) {
//		
//		try {
//			Target target = targetService.getTarget(targetNo);
//			if (target != null) {
//				return new ResponseEntity<Target>(target,HttpStatus.OK);
//			} else {
//				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//			}
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
}
