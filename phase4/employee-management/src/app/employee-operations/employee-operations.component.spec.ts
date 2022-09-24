import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeOperationsComponent } from './employee-operations.component';

describe('EmployeeOperationsComponent', () => {
  let component: EmployeeOperationsComponent;
  let fixture: ComponentFixture<EmployeeOperationsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeeOperationsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployeeOperationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
