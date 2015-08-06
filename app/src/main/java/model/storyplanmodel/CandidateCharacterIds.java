package model.storyplanmodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.storyworldmodel.CharacterIdentifierNew;

/**
 * Created by M. Bonon on 7/19/2015.
 */
public class CandidateCharacterIds {
    private List<CharacterIdentifierNew> candidates;

    public CandidateCharacterIds() {
        candidates = new ArrayList<CharacterIdentifierNew>();
    }

    public void addCandidates(CharacterIdentifierNew candidate) {
        candidates.add(candidate);
    }

    public void removeCandidate(CharacterIdentifierNew candidate) {
        candidates.remove(candidate);
    }

    public Iterator iterator() {
        return candidates.iterator();
    }

    public int size() {
        return candidates.size();
    }

    public List<CharacterIdentifierNew> getCharacterIds() {
        return candidates;
    }

    public void addCandidates(List<CharacterIdentifierNew> supportingCharsId) {
        candidates.addAll(supportingCharsId);
    }
}
