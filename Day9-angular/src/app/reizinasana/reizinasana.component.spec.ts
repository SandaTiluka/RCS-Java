import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReizinasanaComponent } from './reizinasana.component';

describe('ReizinasanaComponent', () => {
  let component: ReizinasanaComponent;
  let fixture: ComponentFixture<ReizinasanaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ReizinasanaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ReizinasanaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
