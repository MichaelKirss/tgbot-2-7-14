package ru.skillfactory.telegbot.tbot.service;


import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import ru.skillfactory.telegbot.tbot.repository.IncomeRepository;
import ru.skillfactory.telegbot.tbot.repository.SpendRepository;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FinanceServiceTest {
    @InjectMocks
    private FinanceService financeService;
    @Mock
    private SpendRepository spendRepository;
    @Mock
    private IncomeRepository incomeRepository;
    @BeforeEach
    public void beforeAll() {
        System.out.println(System.currentTimeMillis());
    }
    @AfterEach
    public void afterEach() {
        System.out.println(System.currentTimeMillis());
    }
    @DisplayName("ADD_INCOME_test")
    @Test
    public void addFinanceOperationAddIncomeTest() {
        String price = "150.0";
        String message = financeService.addFinanceOperation("/addincome", price, 500L);
        Assertions.assertEquals("Доход в размере " + price + " был успешно добавлен", message);
    }
    @DisplayName("ADD_INCOME_test")
    @Test
    public void addFinanceOperationElseBranchTestt() {
        String price = "200";
        String message = financeService.addFinanceOperation("/nan", price, 250L);
        Assertions.assertEquals("Расход в размере " + price + " был успешно добавлен", message);
    }
}