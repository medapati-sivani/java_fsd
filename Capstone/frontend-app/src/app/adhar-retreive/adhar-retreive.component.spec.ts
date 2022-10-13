import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdharRetreiveComponent } from './adhar-retreive.component';

describe('AdharRetreiveComponent', () => {
  let component: AdharRetreiveComponent;
  let fixture: ComponentFixture<AdharRetreiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdharRetreiveComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdharRetreiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
