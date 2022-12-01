// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ActivityInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ActivityInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActivityInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ActivityInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ActivityInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018ActivityInfoNotify.proto\u001a\u0012ActivityInfo.proto\":\n\u0012ActivityInfoNotify\u0012$\n\ractivity_info\u0018\t \u0001(\u000b2\r.ActivityInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ActivityInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ActivityInfoOuterClass.getDescriptor() });
        internal_static_ActivityInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ActivityInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ActivityInfoNotifyOuterClass.internal_static_ActivityInfoNotify_descriptor, new String[] { "ActivityInfo" });
        ActivityInfoOuterClass.getDescriptor();
    }
    
    public static final class ActivityInfoNotify extends GeneratedMessageV3 implements ActivityInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ACTIVITY_INFO_FIELD_NUMBER = 9;
        private ActivityInfoOuterClass.ActivityInfo activityInfo_;
        private byte memoizedIsInitialized;
        private static final ActivityInfoNotify DEFAULT_INSTANCE;
        private static final Parser<ActivityInfoNotify> PARSER;
        
        private ActivityInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ActivityInfoNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ActivityInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ActivityInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 74: {
                            ActivityInfoOuterClass.ActivityInfo.Builder subBuilder = null;
                            if (this.activityInfo_ != null) {
                                subBuilder = this.activityInfo_.toBuilder();
                            }
                            this.activityInfo_ = input.readMessage(ActivityInfoOuterClass.ActivityInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.activityInfo_);
                                this.activityInfo_ = subBuilder.buildPartial();
                                continue;
                            }
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ActivityInfoNotifyOuterClass.internal_static_ActivityInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityInfoNotifyOuterClass.internal_static_ActivityInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityInfoNotify.class, Builder.class);
        }
        
        @Override
        public boolean hasActivityInfo() {
            return this.activityInfo_ != null;
        }
        
        @Override
        public ActivityInfoOuterClass.ActivityInfo getActivityInfo() {
            return (this.activityInfo_ == null) ? ActivityInfoOuterClass.ActivityInfo.getDefaultInstance() : this.activityInfo_;
        }
        
        @Override
        public ActivityInfoOuterClass.ActivityInfoOrBuilder getActivityInfoOrBuilder() {
            return this.getActivityInfo();
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
            if (this.activityInfo_ != null) {
                output.writeMessage(9, this.getActivityInfo());
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
            if (this.activityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getActivityInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityInfoNotify)) {
                return super.equals(obj);
            }
            final ActivityInfoNotify other = (ActivityInfoNotify)obj;
            return this.hasActivityInfo() == other.hasActivityInfo() && (!this.hasActivityInfo() || this.getActivityInfo().equals(other.getActivityInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasActivityInfo()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getActivityInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ActivityInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ActivityInfoNotify.PARSER.parseFrom(data);
        }
        
        public static ActivityInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ActivityInfoNotify.PARSER.parseFrom(data);
        }
        
        public static ActivityInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ActivityInfoNotify.PARSER.parseFrom(data);
        }
        
        public static ActivityInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityInfoNotify.PARSER, input);
        }
        
        public static ActivityInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static ActivityInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityInfoNotify.PARSER, input);
        }
        
        public static ActivityInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static ActivityInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityInfoNotify.PARSER, input);
        }
        
        public static ActivityInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ActivityInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ActivityInfoNotify prototype) {
            return ActivityInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ActivityInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ActivityInfoNotify getDefaultInstance() {
            return ActivityInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ActivityInfoNotify> parser() {
            return ActivityInfoNotify.PARSER;
        }
        
        @Override
        public Parser<ActivityInfoNotify> getParserForType() {
            return ActivityInfoNotify.PARSER;
        }
        
        @Override
        public ActivityInfoNotify getDefaultInstanceForType() {
            return ActivityInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ActivityInfoNotify();
            PARSER = new AbstractParser<ActivityInfoNotify>() {
                @Override
                public ActivityInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ActivityInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActivityInfoNotifyOrBuilder
        {
            private ActivityInfoOuterClass.ActivityInfo activityInfo_;
            private SingleFieldBuilderV3<ActivityInfoOuterClass.ActivityInfo, ActivityInfoOuterClass.ActivityInfo.Builder, ActivityInfoOuterClass.ActivityInfoOrBuilder> activityInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ActivityInfoNotifyOuterClass.internal_static_ActivityInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ActivityInfoNotifyOuterClass.internal_static_ActivityInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ActivityInfoNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.activityInfoBuilder_ == null) {
                    this.activityInfo_ = null;
                }
                else {
                    this.activityInfo_ = null;
                    this.activityInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ActivityInfoNotifyOuterClass.internal_static_ActivityInfoNotify_descriptor;
            }
            
            @Override
            public ActivityInfoNotify getDefaultInstanceForType() {
                return ActivityInfoNotify.getDefaultInstance();
            }
            
            @Override
            public ActivityInfoNotify build() {
                final ActivityInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ActivityInfoNotify buildPartial() {
                final ActivityInfoNotify result = new ActivityInfoNotify(this);
                if (this.activityInfoBuilder_ == null) {
                    result.activityInfo_ = this.activityInfo_;
                }
                else {
                    result.activityInfo_ = this.activityInfoBuilder_.build();
                }
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
                if (other instanceof ActivityInfoNotify) {
                    return this.mergeFrom((ActivityInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ActivityInfoNotify other) {
                if (other == ActivityInfoNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.hasActivityInfo()) {
                    this.mergeActivityInfo(other.getActivityInfo());
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
                ActivityInfoNotify parsedMessage = null;
                try {
                    parsedMessage = ActivityInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ActivityInfoNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public boolean hasActivityInfo() {
                return this.activityInfoBuilder_ != null || this.activityInfo_ != null;
            }
            
            @Override
            public ActivityInfoOuterClass.ActivityInfo getActivityInfo() {
                if (this.activityInfoBuilder_ == null) {
                    return (this.activityInfo_ == null) ? ActivityInfoOuterClass.ActivityInfo.getDefaultInstance() : this.activityInfo_;
                }
                return this.activityInfoBuilder_.getMessage();
            }
            
            public Builder setActivityInfo(final ActivityInfoOuterClass.ActivityInfo value) {
                if (this.activityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.activityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.activityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setActivityInfo(final ActivityInfoOuterClass.ActivityInfo.Builder builderForValue) {
                if (this.activityInfoBuilder_ == null) {
                    this.activityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.activityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeActivityInfo(final ActivityInfoOuterClass.ActivityInfo value) {
                if (this.activityInfoBuilder_ == null) {
                    if (this.activityInfo_ != null) {
                        this.activityInfo_ = ActivityInfoOuterClass.ActivityInfo.newBuilder(this.activityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.activityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.activityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearActivityInfo() {
                if (this.activityInfoBuilder_ == null) {
                    this.activityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.activityInfo_ = null;
                    this.activityInfoBuilder_ = null;
                }
                return this;
            }
            
            public ActivityInfoOuterClass.ActivityInfo.Builder getActivityInfoBuilder() {
                this.onChanged();
                return this.getActivityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public ActivityInfoOuterClass.ActivityInfoOrBuilder getActivityInfoOrBuilder() {
                if (this.activityInfoBuilder_ != null) {
                    return this.activityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.activityInfo_ == null) ? ActivityInfoOuterClass.ActivityInfo.getDefaultInstance() : this.activityInfo_;
            }
            
            private SingleFieldBuilderV3<ActivityInfoOuterClass.ActivityInfo, ActivityInfoOuterClass.ActivityInfo.Builder, ActivityInfoOuterClass.ActivityInfoOrBuilder> getActivityInfoFieldBuilder() {
                if (this.activityInfoBuilder_ == null) {
                    this.activityInfoBuilder_ = new SingleFieldBuilderV3<ActivityInfoOuterClass.ActivityInfo, ActivityInfoOuterClass.ActivityInfo.Builder, ActivityInfoOuterClass.ActivityInfoOrBuilder>(this.getActivityInfo(), this.getParentForChildren(), this.isClean());
                    this.activityInfo_ = null;
                }
                return this.activityInfoBuilder_;
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
    
    public interface ActivityInfoNotifyOrBuilder extends MessageOrBuilder
    {
        boolean hasActivityInfo();
        
        ActivityInfoOuterClass.ActivityInfo getActivityInfo();
        
        ActivityInfoOuterClass.ActivityInfoOrBuilder getActivityInfoOrBuilder();
    }
}
