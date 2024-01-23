import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AtnemsanaComponent } from './atnemsana.component';

describe('AtnemsanaComponent', () => {
  let component: AtnemsanaComponent;
  let fixture: ComponentFixture<AtnemsanaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AtnemsanaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AtnemsanaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
