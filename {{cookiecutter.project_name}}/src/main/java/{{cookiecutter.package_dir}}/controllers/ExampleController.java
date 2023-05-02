package {{cookiecutter.package}}.controllers;

import {{cookiecutter.package}}.services.IExampleService;

@Slf4j
@RestController
@RequestMapping("example")
@Tag(name = "Example", description = "Example RESTful Control")
public class ExampleController {
    private final IExampleService service;

    @Autowired
    public ExampleController(@Qualifier("exampleService") IExampleService service){
        this.service = service;
    }

    @Operation(summary = "Example Add Endpoint")
    @GetMapping(value = "/{a}/{b}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ExampleDto> add(@PathVariable float a, @PathVariable float b){
        log.info("Example: add");
        return new ResponseEntity<>(this.service.add(a, b));
    }

}
