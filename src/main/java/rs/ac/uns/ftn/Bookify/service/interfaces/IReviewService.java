package rs.ac.uns.ftn.Bookify.service.interfaces;

import rs.ac.uns.ftn.Bookify.dto.CommentDTO;
import rs.ac.uns.ftn.Bookify.dto.RatingDTO;

import java.util.Collection;

public interface IReviewService {
    public RatingDTO getRating(Long ownerId);
    public Collection<CommentDTO> getOwnerComments(Long ownerId);
}
