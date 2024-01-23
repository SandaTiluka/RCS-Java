import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParmaniComponent } from './parmani.component';

describe('ParmaniComponent', () => {
  let component: ParmaniComponent;
  let fixture: ComponentFixture<ParmaniComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ParmaniComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ParmaniComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
