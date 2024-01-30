package mapping.mappers;

import mapping.dtos.ProfessorDTO;
import model.Professor;

public class ProfessorMapper {
    public static Professor mapFrom(ProfessorDTO dto){
        return new Professor(dto.name(),"123", dto.category());
    }
    public static ProfessorDTO mapFrom(Professor professor){
        return new ProfessorDTO(professor.getName(),professor.getCategory());
    }
}
