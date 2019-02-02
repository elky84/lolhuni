package com.lol.tracer.web;

import java.util.List;

import com.lol.tracer.model.lol.Summoner;
import com.lol.tracer.service.LoLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lol.tracer.service.SummonerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//
@Controller
@Api(tags = "SummonerApi")
public class SummonerController {
	
	@Autowired
	SummonerService summonerService;

	@Autowired
	LoLService loLService;

	@RequestMapping(value = "/summoners", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation("소환사 등록")
	public ResponseEntity<?> registSummoner(@RequestParam String summonerName) {
		
		try {
			Summoner summoner = summonerService.registSummoner(summonerName);
			
			if (summoner != null) {
				return new ResponseEntity<>(summoner, HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/summoners", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation("등록된 소환사 리스트")
	public ResponseEntity<?> summonerList() {
		
		try {
			List<Summoner> summoners = summonerService.summonerList();
			return new ResponseEntity<>(summoners,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/summoners/{summonerName}/recent", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation("소환사 최근 게임 상세정보")
	public ResponseEntity<?> SummonerRecentGameInfo(@PathVariable String summonerName) {
		
		try {
			Summoner summoner = summonerService.summonerInfo(summonerName);
			if (summoner != null) {
				return new ResponseEntity<>(loLService.recentGameInfo(summoner.getId()), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/summoners/{summonerName}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation("소환사 상세정보")
	public ResponseEntity<?> SummonerInfo(@PathVariable String summonerName) {

		try {
			Summoner summoner = summonerService.summonerInfo(summonerName);
			if (summoner != null) {
				return new ResponseEntity<>(summoner,HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/summoners/{summonerName}", method = RequestMethod.DELETE)
	@ResponseBody
	@ApiOperation("소환사 삭제")
	public ResponseEntity<?> removeSummoner(@PathVariable String summonerName) {
		
		summonerService.removeSummoner(summonerName);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
