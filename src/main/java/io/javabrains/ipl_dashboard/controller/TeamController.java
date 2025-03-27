package io.javabrains.ipl_dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.ipl_dashboard.model.Team;
import io.javabrains.ipl_dashboard.repository.MatchRepository;
import io.javabrains.ipl_dashboard.repository.TeamRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TeamController {
    
    @Autowired
    TeamRepository teamRepository;

    @Autowired
    MatchRepository matchRepository;

    @GetMapping("/team/{teamName}")
    public Team getMethodName(@PathVariable String teamName) {
        Team team = teamRepository.findByTeamName(teamName);
        team.setMatches(matchRepository.findLatestMatchesByTeam(teamName, 4));
        return team;

    }

    @GetMapping("/team")
    public Iterable<Team> getAllTeam() {
        return teamRepository.findAll();
    }

    // @GetMapping("/team/{teamName}/matches")
    // public List<Matches> 
}
