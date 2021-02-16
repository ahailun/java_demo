@RestController
public class DemoController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello GitHub Actions!";
    }
}