import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserImputComponent } from './user-imput.component';

describe('UserImputComponent', () => {
  let component: UserImputComponent;
  let fixture: ComponentFixture<UserImputComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UserImputComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UserImputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
