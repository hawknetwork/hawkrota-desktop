package org.hawknetwork.hawkrota.core.solution;

import java.util.Collection;
import java.util.List;

import org.drools.planner.core.score.buildin.hardandsoft.HardAndSoftScore;
import org.drools.planner.core.solution.Solution;
import org.hawknetwork.hawkrota.core.entity.SlotAssignmentEntity;
import org.hawknetwork.hawkrota.domain.JobList;
import org.hawknetwork.hawkrota.domain.PersonGroupList;
import org.hawknetwork.hawkrota.domain.PersonList;

public class Rota implements Solution<HardAndSoftScore> {

	// Problem Facts
	JobList jobList;
	PersonList personList;
	PersonGroupList personGroupList;
	
	// Planning Entities
	List<SlotAssignmentEntity> slotAssignmentEntityList;
	
	// Score
	HardAndSoftScore score;
	
	@Override
	public HardAndSoftScore getScore() {
		return score;
	}

	@Override
	public void setScore(HardAndSoftScore score) {
		this.score = score;
	}

	@Override
	public Collection<? extends Object> getProblemFacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Solution<HardAndSoftScore> cloneSolution() {
		// TODO Auto-generated method stub
		return null;
	}
}
