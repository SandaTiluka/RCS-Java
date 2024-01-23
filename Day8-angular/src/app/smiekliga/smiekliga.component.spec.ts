import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SmiekligaComponent } from './smiekliga.component';

describe('SmiekligaComponent', () => {
  let component: SmiekligaComponent;
  let fixture: ComponentFixture<SmiekligaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SmiekligaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SmiekligaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
