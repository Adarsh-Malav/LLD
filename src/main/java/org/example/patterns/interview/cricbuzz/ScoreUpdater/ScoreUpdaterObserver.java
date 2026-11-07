package org.example.patterns.interview.cricbuzz.ScoreUpdater;


import org.example.patterns.interview.cricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
