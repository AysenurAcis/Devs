package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.business.requests.programmingLanguages.CreateProgrammingLanguageRequest;
import kodlama.io.Devs.business.requests.programmingLanguages.DeleteProgrammingLanguageRequest;
import kodlama.io.Devs.business.responses.programmingLanguages.GetAllProgramingLanguagesResponse;
import kodlama.io.Devs.business.responses.programmingLanguages.GetByIdProgrammingLanguageResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
    public ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<GetAllProgramingLanguagesResponse> getAll() {
        return programmingLanguageService.getAll();
    }

    @GetMapping("/getbyid")
    public GetByIdProgrammingLanguageResponse getById(int id) throws Exception {
        return programmingLanguageService.getById(id);
    }

    @PostMapping("/add")
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
        this.programmingLanguageService.add(createProgrammingLanguageRequest);
    }

    @PutMapping("/update")
    public void update() throws Exception {
        this.programmingLanguageService.update();
    }

    @DeleteMapping("/{id}")
    public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception {
        this.programmingLanguageService.delete(deleteProgrammingLanguageRequest);
    }
}