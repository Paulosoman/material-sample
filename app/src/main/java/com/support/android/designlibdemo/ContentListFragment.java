/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.support.android.designlibdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.support.android.designlibdemo.model.RowItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ContentListFragment extends BaseFragment {
	private String tabType = "";
	public static final String TAB_TYPE_KEY = "TAB_TYPE_KEY";

	public static ContentListFragment newInstance(Bundle bundle) {
		ContentListFragment fragment = new ContentListFragment();
		fragment.setArguments(bundle);
		return fragment;
	}

	@Override public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		tabType=getArguments().getString(TAB_TYPE_KEY);
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		RecyclerView rv = (RecyclerView) inflater.inflate(
				R.layout.fragment_cheese_list, container, false);
		setupRecyclerView(rv);
		return rv;
	}

	private void setupRecyclerView(RecyclerView recyclerView) {
		recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
		recyclerView.setAdapter(new SimpleStringRecyclerViewAdapter(getActivity(), MockDataHelper.getRowItems(tabType,30)
		));
	}

	private List<String> getRandomSublist(String[] array, int amount) {
		ArrayList<String> list = new ArrayList<>(amount);
		Random random = new Random();
		while (list.size() < amount) {
			list.add(array[random.nextInt(array.length)]);
		}
		return list;
	}

	public static class SimpleStringRecyclerViewAdapter
			extends RecyclerView.Adapter<SimpleStringRecyclerViewAdapter.ViewHolder> {

		private final TypedValue mTypedValue = new TypedValue();
		private int mBackground;
		private List<RowItem> mValues;

		public static class ViewHolder extends RecyclerView.ViewHolder {
			public String mBoundString;

			public final View mView;
			public final ImageView mImageView;
			public final TextView mTextView;

			public ViewHolder(View view) {
				super(view);
				mView = view;
				mImageView = (ImageView) view.findViewById(R.id.avatar);
				mTextView = (TextView) view.findViewById(android.R.id.text1);
			}

			@Override
			public String toString() {
				return super.toString() + " '" + mTextView.getText();
			}
		}

		public RowItem getValueAt(int position) {
			return mValues.get(position);
		}

		public SimpleStringRecyclerViewAdapter(Context context, List<RowItem> items) {
			context.getTheme().resolveAttribute(R.attr.selectableItemBackground, mTypedValue, true);
			mBackground = mTypedValue.resourceId;
			mValues = items;
		}

		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			View view = LayoutInflater.from(parent.getContext())
					.inflate(R.layout.list_item, parent, false);
			view.setBackgroundResource(mBackground);
			return new ViewHolder(view);
		}

		@Override
		public void onBindViewHolder(final ViewHolder holder, int position) {
			holder.mBoundString = mValues.get(position).getTitle();
			holder.mTextView.setText(mValues.get(position).getTitle());

			holder.mView.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Context context = v.getContext();
					Intent intent = new Intent(context, ContentDetailActivity.class);
					intent.putExtra(ContentDetailActivity.EXTRA_NAME, holder.mBoundString);

					context.startActivity(intent);
				}
			});

			Glide.with(holder.mImageView.getContext())
					.load(Cheeses.getRandomCheeseDrawable())
					.fitCenter()
					.into(holder.mImageView);
		}

		@Override
		public int getItemCount() {
			return mValues.size();
		}
	}
}
