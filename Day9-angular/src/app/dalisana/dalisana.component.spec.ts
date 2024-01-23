import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DalisanaComponent } from './dalisana.component';

describe('DalisanaComponent', () => {
  let component: DalisanaComponent;
  let fixture: ComponentFixture<DalisanaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DalisanaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DalisanaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
