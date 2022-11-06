package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.business.requests.programmingLanguages.CreateProgrammingLanguageRequest;
import kodlama.io.Devs.business.requests.programmingLanguages.DeleteProgrammingLanguageRequest;
import kodlama.io.Devs.business.responses.programmingLanguages.GetAllProgramingLanguagesResponse;
import kodlama.io.Devs.business.responses.programmingLanguages.GetByIdProgrammingLanguageResponse;

import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllProgramingLanguagesResponse> getAll();
    GetByIdProgrammingLanguageResponse getById(int id) throws Exception;
    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
    void update() throws Exception;
    void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception;
}