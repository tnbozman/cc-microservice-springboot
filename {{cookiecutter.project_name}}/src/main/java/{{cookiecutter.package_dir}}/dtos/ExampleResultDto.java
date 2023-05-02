package {package-name}.dtos;

@Data
public class ExampleResultDto
{
    public ExampleResultDto() {
    }

    public ExampleResultDto(float result){
        this.result = result;
    }
    
    @Schema(description = "mathematical result as a float")
    @JsonProperty( value = "result")
    private float result;
}