import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DialogOrderCreateComponent } from './dialog-order-create.component';

describe('PageOrderCreateComponent', () => {
  let component: DialogOrderCreateComponent;
  let fixture: ComponentFixture<DialogOrderCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DialogOrderCreateComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DialogOrderCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
