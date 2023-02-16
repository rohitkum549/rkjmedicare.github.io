import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MedicarehomeComponent } from './medicarehome.component';

describe('MedicarehomeComponent', () => {
  let component: MedicarehomeComponent;
  let fixture: ComponentFixture<MedicarehomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MedicarehomeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MedicarehomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
