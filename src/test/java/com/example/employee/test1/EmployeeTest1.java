package com.example.employee.test1;

import com.example.employee.model.Employee;
import com.example.employee.repo.EmployeeRepository;
import com.example.employee.service.EmployeeService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Id;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeTest1 {
    @InjectMocks
    private EmployeeService employeeService;
    @Mock
    private EmployeeRepository employeeRepository;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void getAllEmployeeTest() {
        Mockito.when(employeeRepository.findAll()).thenReturn(Stream.of(new Employee(128, "Gvara", "bhgff", "ghuiij", "neelima@123", 9390956)).collect(Collectors.toList()));
        assertEquals(1, employeeService.getAllEmployee().size());
    }
    @Test
    public void addTest(){
        Employee employee=(new Employee(124, "Gvara", "bhgff", "ghuiij", "neelima@123", 9390956));
        Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
        assertEquals(employee,employeeService.add(employee)) ;
    }

    @Test
    public void  getEmployeeByIdTest() {
long id=124;
    Employee employee=(new Employee(124, "Gvara", "bhgff", "ghuiij", "neelima@123", 9390956));
        Mockito.when(employeeRepository.findById(id )).thenReturn(Optional.of(employee)) ;
        assertEquals(124, employeeService.getEmployeeById(id ).getId() );
    }
@Test
    public void   updateTest(){
        Employee employee = new Employee(128,"werfv","jhnm","nhklop","sagar@234",88794820) ;
        Mockito.when(employeeRepository. save(employee ) ).thenReturn(employee) ;
        assertEquals(employee,employeeService.update(employee,employee.getId()) ) ;
    }
    @Test
    public void   deleteTest(){
      Employee  employee = new Employee(128,"werfv","jhnm","nhklop","sagar@234",88794820) ;
        employeeService.delete(employee.getId());
     Mockito.verify(employeeRepository,times(1)).deleteById(employee.getId()) ;

    }

}

