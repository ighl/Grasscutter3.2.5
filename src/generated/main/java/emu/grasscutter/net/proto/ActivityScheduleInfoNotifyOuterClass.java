// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ActivityScheduleInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ActivityScheduleInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActivityScheduleInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ActivityScheduleInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ActivityScheduleInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n ActivityScheduleInfoNotify.proto\u001a\u001aActivityScheduleInfo.proto\"t\n\u001aActivityScheduleInfoNotify\u00125\n\u0016activity_schedule_list\u0018\f \u0003(\u000b2\u0015.ActivityScheduleInfo\u0012\u001f\n\u0017remain_fly_sea_lamp_num\u0018\u0006 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ActivityScheduleInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ActivityScheduleInfoOuterClass.getDescriptor() });
        internal_static_ActivityScheduleInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ActivityScheduleInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ActivityScheduleInfoNotifyOuterClass.internal_static_ActivityScheduleInfoNotify_descriptor, new String[] { "ActivityScheduleList", "RemainFlySeaLampNum" });
        ActivityScheduleInfoOuterClass.getDescriptor();
    }
    
    public static final class ActivityScheduleInfoNotify extends GeneratedMessageV3 implements ActivityScheduleInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ACTIVITY_SCHEDULE_LIST_FIELD_NUMBER = 12;
        private List<ActivityScheduleInfoOuterClass.ActivityScheduleInfo> activityScheduleList_;
        public static final int REMAIN_FLY_SEA_LAMP_NUM_FIELD_NUMBER = 6;
        private int remainFlySeaLampNum_;
        private byte memoizedIsInitialized;
        private static final ActivityScheduleInfoNotify DEFAULT_INSTANCE;
        private static final Parser<ActivityScheduleInfoNotify> PARSER;
        
        private ActivityScheduleInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ActivityScheduleInfoNotify() {
            this.memoizedIsInitialized = -1;
            this.activityScheduleList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ActivityScheduleInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ActivityScheduleInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 48: {
                            this.remainFlySeaLampNum_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.activityScheduleList_ = new ArrayList<ActivityScheduleInfoOuterClass.ActivityScheduleInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.activityScheduleList_.add(input.readMessage(ActivityScheduleInfoOuterClass.ActivityScheduleInfo.parser(), extensionRegistry));
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.activityScheduleList_ = Collections.unmodifiableList((List<? extends ActivityScheduleInfoOuterClass.ActivityScheduleInfo>)this.activityScheduleList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ActivityScheduleInfoNotifyOuterClass.internal_static_ActivityScheduleInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityScheduleInfoNotifyOuterClass.internal_static_ActivityScheduleInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityScheduleInfoNotify.class, Builder.class);
        }
        
        @Override
        public List<ActivityScheduleInfoOuterClass.ActivityScheduleInfo> getActivityScheduleListList() {
            return this.activityScheduleList_;
        }
        
        @Override
        public List<? extends ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder> getActivityScheduleListOrBuilderList() {
            return this.activityScheduleList_;
        }
        
        @Override
        public int getActivityScheduleListCount() {
            return this.activityScheduleList_.size();
        }
        
        @Override
        public ActivityScheduleInfoOuterClass.ActivityScheduleInfo getActivityScheduleList(final int index) {
            return this.activityScheduleList_.get(index);
        }
        
        @Override
        public ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder getActivityScheduleListOrBuilder(final int index) {
            return this.activityScheduleList_.get(index);
        }
        
        @Override
        public int getRemainFlySeaLampNum() {
            return this.remainFlySeaLampNum_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.remainFlySeaLampNum_ != 0) {
                output.writeUInt32(6, this.remainFlySeaLampNum_);
            }
            for (int i = 0; i < this.activityScheduleList_.size(); ++i) {
                output.writeMessage(12, this.activityScheduleList_.get(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.remainFlySeaLampNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.remainFlySeaLampNum_);
            }
            for (int i = 0; i < this.activityScheduleList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(12, this.activityScheduleList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityScheduleInfoNotify)) {
                return super.equals(obj);
            }
            final ActivityScheduleInfoNotify other = (ActivityScheduleInfoNotify)obj;
            return this.getActivityScheduleListList().equals(other.getActivityScheduleListList()) && this.getRemainFlySeaLampNum() == other.getRemainFlySeaLampNum() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getActivityScheduleListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getActivityScheduleListList().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getRemainFlySeaLampNum();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ActivityScheduleInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ActivityScheduleInfoNotify.PARSER.parseFrom(data);
        }
        
        public static ActivityScheduleInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityScheduleInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityScheduleInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ActivityScheduleInfoNotify.PARSER.parseFrom(data);
        }
        
        public static ActivityScheduleInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityScheduleInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityScheduleInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ActivityScheduleInfoNotify.PARSER.parseFrom(data);
        }
        
        public static ActivityScheduleInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityScheduleInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityScheduleInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityScheduleInfoNotify.PARSER, input);
        }
        
        public static ActivityScheduleInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityScheduleInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static ActivityScheduleInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityScheduleInfoNotify.PARSER, input);
        }
        
        public static ActivityScheduleInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityScheduleInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static ActivityScheduleInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityScheduleInfoNotify.PARSER, input);
        }
        
        public static ActivityScheduleInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityScheduleInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ActivityScheduleInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ActivityScheduleInfoNotify prototype) {
            return ActivityScheduleInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ActivityScheduleInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ActivityScheduleInfoNotify getDefaultInstance() {
            return ActivityScheduleInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ActivityScheduleInfoNotify> parser() {
            return ActivityScheduleInfoNotify.PARSER;
        }
        
        @Override
        public Parser<ActivityScheduleInfoNotify> getParserForType() {
            return ActivityScheduleInfoNotify.PARSER;
        }
        
        @Override
        public ActivityScheduleInfoNotify getDefaultInstanceForType() {
            return ActivityScheduleInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ActivityScheduleInfoNotify();
            PARSER = new AbstractParser<ActivityScheduleInfoNotify>() {
                @Override
                public ActivityScheduleInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ActivityScheduleInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActivityScheduleInfoNotifyOrBuilder
        {
            private int bitField0_;
            private List<ActivityScheduleInfoOuterClass.ActivityScheduleInfo> activityScheduleList_;
            private RepeatedFieldBuilderV3<ActivityScheduleInfoOuterClass.ActivityScheduleInfo, ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder, ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder> activityScheduleListBuilder_;
            private int remainFlySeaLampNum_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ActivityScheduleInfoNotifyOuterClass.internal_static_ActivityScheduleInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ActivityScheduleInfoNotifyOuterClass.internal_static_ActivityScheduleInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityScheduleInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.activityScheduleList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.activityScheduleList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ActivityScheduleInfoNotify.alwaysUseFieldBuilders) {
                    this.getActivityScheduleListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.activityScheduleListBuilder_ == null) {
                    this.activityScheduleList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.activityScheduleListBuilder_.clear();
                }
                this.remainFlySeaLampNum_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ActivityScheduleInfoNotifyOuterClass.internal_static_ActivityScheduleInfoNotify_descriptor;
            }
            
            @Override
            public ActivityScheduleInfoNotify getDefaultInstanceForType() {
                return ActivityScheduleInfoNotify.getDefaultInstance();
            }
            
            @Override
            public ActivityScheduleInfoNotify build() {
                final ActivityScheduleInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ActivityScheduleInfoNotify buildPartial() {
                final ActivityScheduleInfoNotify result = new ActivityScheduleInfoNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.activityScheduleListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.activityScheduleList_ = Collections.unmodifiableList((List<? extends ActivityScheduleInfoOuterClass.ActivityScheduleInfo>)this.activityScheduleList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.activityScheduleList_ = this.activityScheduleList_;
                }
                else {
                    result.activityScheduleList_ = this.activityScheduleListBuilder_.build();
                }
                result.remainFlySeaLampNum_ = this.remainFlySeaLampNum_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof ActivityScheduleInfoNotify) {
                    return this.mergeFrom((ActivityScheduleInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ActivityScheduleInfoNotify other) {
                if (other == ActivityScheduleInfoNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.activityScheduleListBuilder_ == null) {
                    if (!other.activityScheduleList_.isEmpty()) {
                        if (this.activityScheduleList_.isEmpty()) {
                            this.activityScheduleList_ = other.activityScheduleList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureActivityScheduleListIsMutable();
                            this.activityScheduleList_.addAll(other.activityScheduleList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.activityScheduleList_.isEmpty()) {
                    if (this.activityScheduleListBuilder_.isEmpty()) {
                        this.activityScheduleListBuilder_.dispose();
                        this.activityScheduleListBuilder_ = null;
                        this.activityScheduleList_ = other.activityScheduleList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.activityScheduleListBuilder_ = (ActivityScheduleInfoNotify.alwaysUseFieldBuilders ? this.getActivityScheduleListFieldBuilder() : null);
                    }
                    else {
                        this.activityScheduleListBuilder_.addAllMessages(other.activityScheduleList_);
                    }
                }
                if (other.getRemainFlySeaLampNum() != 0) {
                    this.setRemainFlySeaLampNum(other.getRemainFlySeaLampNum());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                ActivityScheduleInfoNotify parsedMessage = null;
                try {
                    parsedMessage = ActivityScheduleInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ActivityScheduleInfoNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureActivityScheduleListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.activityScheduleList_ = new ArrayList<ActivityScheduleInfoOuterClass.ActivityScheduleInfo>(this.activityScheduleList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ActivityScheduleInfoOuterClass.ActivityScheduleInfo> getActivityScheduleListList() {
                if (this.activityScheduleListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ActivityScheduleInfoOuterClass.ActivityScheduleInfo>)this.activityScheduleList_);
                }
                return this.activityScheduleListBuilder_.getMessageList();
            }
            
            @Override
            public int getActivityScheduleListCount() {
                if (this.activityScheduleListBuilder_ == null) {
                    return this.activityScheduleList_.size();
                }
                return this.activityScheduleListBuilder_.getCount();
            }
            
            @Override
            public ActivityScheduleInfoOuterClass.ActivityScheduleInfo getActivityScheduleList(final int index) {
                if (this.activityScheduleListBuilder_ == null) {
                    return this.activityScheduleList_.get(index);
                }
                return this.activityScheduleListBuilder_.getMessage(index);
            }
            
            public Builder setActivityScheduleList(final int index, final ActivityScheduleInfoOuterClass.ActivityScheduleInfo value) {
                if (this.activityScheduleListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureActivityScheduleListIsMutable();
                    this.activityScheduleList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.activityScheduleListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setActivityScheduleList(final int index, final ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder builderForValue) {
                if (this.activityScheduleListBuilder_ == null) {
                    this.ensureActivityScheduleListIsMutable();
                    this.activityScheduleList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.activityScheduleListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addActivityScheduleList(final ActivityScheduleInfoOuterClass.ActivityScheduleInfo value) {
                if (this.activityScheduleListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureActivityScheduleListIsMutable();
                    this.activityScheduleList_.add(value);
                    this.onChanged();
                }
                else {
                    this.activityScheduleListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addActivityScheduleList(final int index, final ActivityScheduleInfoOuterClass.ActivityScheduleInfo value) {
                if (this.activityScheduleListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureActivityScheduleListIsMutable();
                    this.activityScheduleList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.activityScheduleListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addActivityScheduleList(final ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder builderForValue) {
                if (this.activityScheduleListBuilder_ == null) {
                    this.ensureActivityScheduleListIsMutable();
                    this.activityScheduleList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.activityScheduleListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addActivityScheduleList(final int index, final ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder builderForValue) {
                if (this.activityScheduleListBuilder_ == null) {
                    this.ensureActivityScheduleListIsMutable();
                    this.activityScheduleList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.activityScheduleListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllActivityScheduleList(final Iterable<? extends ActivityScheduleInfoOuterClass.ActivityScheduleInfo> values) {
                if (this.activityScheduleListBuilder_ == null) {
                    this.ensureActivityScheduleListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.activityScheduleList_);
                    this.onChanged();
                }
                else {
                    this.activityScheduleListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearActivityScheduleList() {
                if (this.activityScheduleListBuilder_ == null) {
                    this.activityScheduleList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.activityScheduleListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeActivityScheduleList(final int index) {
                if (this.activityScheduleListBuilder_ == null) {
                    this.ensureActivityScheduleListIsMutable();
                    this.activityScheduleList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.activityScheduleListBuilder_.remove(index);
                }
                return this;
            }
            
            public ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder getActivityScheduleListBuilder(final int index) {
                return this.getActivityScheduleListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder getActivityScheduleListOrBuilder(final int index) {
                if (this.activityScheduleListBuilder_ == null) {
                    return this.activityScheduleList_.get(index);
                }
                return this.activityScheduleListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder> getActivityScheduleListOrBuilderList() {
                if (this.activityScheduleListBuilder_ != null) {
                    return this.activityScheduleListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder>)this.activityScheduleList_);
            }
            
            public ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder addActivityScheduleListBuilder() {
                return this.getActivityScheduleListFieldBuilder().addBuilder(ActivityScheduleInfoOuterClass.ActivityScheduleInfo.getDefaultInstance());
            }
            
            public ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder addActivityScheduleListBuilder(final int index) {
                return this.getActivityScheduleListFieldBuilder().addBuilder(index, ActivityScheduleInfoOuterClass.ActivityScheduleInfo.getDefaultInstance());
            }
            
            public List<ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder> getActivityScheduleListBuilderList() {
                return this.getActivityScheduleListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ActivityScheduleInfoOuterClass.ActivityScheduleInfo, ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder, ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder> getActivityScheduleListFieldBuilder() {
                if (this.activityScheduleListBuilder_ == null) {
                    this.activityScheduleListBuilder_ = new RepeatedFieldBuilderV3<ActivityScheduleInfoOuterClass.ActivityScheduleInfo, ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder, ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder>(this.activityScheduleList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.activityScheduleList_ = null;
                }
                return this.activityScheduleListBuilder_;
            }
            
            @Override
            public int getRemainFlySeaLampNum() {
                return this.remainFlySeaLampNum_;
            }
            
            public Builder setRemainFlySeaLampNum(final int value) {
                this.remainFlySeaLampNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRemainFlySeaLampNum() {
                this.remainFlySeaLampNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface ActivityScheduleInfoNotifyOrBuilder extends MessageOrBuilder
    {
        List<ActivityScheduleInfoOuterClass.ActivityScheduleInfo> getActivityScheduleListList();
        
        ActivityScheduleInfoOuterClass.ActivityScheduleInfo getActivityScheduleList(final int p0);
        
        int getActivityScheduleListCount();
        
        List<? extends ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder> getActivityScheduleListOrBuilderList();
        
        ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder getActivityScheduleListOrBuilder(final int p0);
        
        int getRemainFlySeaLampNum();
    }
}
