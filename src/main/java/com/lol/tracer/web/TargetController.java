package com.lol.tracer.web;

import java.util.List;

import com.lol.tracer.model.Target;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
	public ResponseEntity<?> target(@RequestParam String summonerName) {
		
		try {
			Target target = targetService.registTarget(summonerName);
			
			if (target != null) {
				return new ResponseEntity<>(target,HttpStatus.CREATED);
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
	public ResponseEntity<?> list() {
		
		try {
			List<Target> targets = targetService.getTargets();
			return new ResponseEntity<>(targets,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * 등록된 소환사 삭제
	 * @return
	 */
	@RequestMapping(value = "/targets/{summonerId}", method = RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation("타겟 삭제")
	public ResponseEntity<?> delete(@PathVariable("summonerId") long summonerId) {

		try {
			targetService.removeTarget(summonerId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
