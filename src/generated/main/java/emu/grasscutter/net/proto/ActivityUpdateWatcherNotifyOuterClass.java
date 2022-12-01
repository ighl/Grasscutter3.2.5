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

public final class ActivityUpdateWatcherNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ActivityUpdateWatcherNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActivityUpdateWatcherNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ActivityUpdateWatcherNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ActivityUpdateWatcherNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!ActivityUpdateWatcherNotify.proto\u001a\u0019ActivityWatcherInfo.proto\"^\n\u001bActivityUpdateWatcherNotify\u0012*\n\fwatcher_info\u0018\u0002 \u0001(\u000b2\u0014.ActivityWatcherInfo\u0012\u0013\n\u000bactivity_id\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ActivityUpdateWatcherNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ActivityWatcherInfoOuterClass.getDescriptor() });
        internal_static_ActivityUpdateWatcherNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ActivityUpdateWatcherNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ActivityUpdateWatcherNotifyOuterClass.internal_static_ActivityUpdateWatcherNotify_descriptor, new String[] { "WatcherInfo", "ActivityId" });
        ActivityWatcherInfoOuterClass.getDescriptor();
    }
    
    public static final class ActivityUpdateWatcherNotify extends GeneratedMessageV3 implements ActivityUpdateWatcherNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int WATCHER_INFO_FIELD_NUMBER = 2;
        private ActivityWatcherInfoOuterClass.ActivityWatcherInfo watcherInfo_;
        public static final int ACTIVITY_ID_FIELD_NUMBER = 1;
        private int activityId_;
        private byte memoizedIsInitialized;
        private static final ActivityUpdateWatcherNotify DEFAULT_INSTANCE;
        private static final Parser<ActivityUpdateWatcherNotify> PARSER;
        
        private ActivityUpdateWatcherNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ActivityUpdateWatcherNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ActivityUpdateWatcherNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ActivityUpdateWatcherNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.activityId_ = input.readUInt32();
                            continue;
                        }
                        case 18: {
                            ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder subBuilder = null;
                            if (this.watcherInfo_ != null) {
                                subBuilder = this.watcherInfo_.toBuilder();
                            }
                            this.watcherInfo_ = input.readMessage(ActivityWatcherInfoOuterClass.ActivityWatcherInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.watcherInfo_);
                                this.watcherInfo_ = subBuilder.buildPartial();
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
            return ActivityUpdateWatcherNotifyOuterClass.internal_static_ActivityUpdateWatcherNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityUpdateWatcherNotifyOuterClass.internal_static_ActivityUpdateWatcherNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityUpdateWatcherNotify.class, Builder.class);
        }
        
        @Override
        public boolean hasWatcherInfo() {
            return this.watcherInfo_ != null;
        }
        
        @Override
        public ActivityWatcherInfoOuterClass.ActivityWatcherInfo getWatcherInfo() {
            return (this.watcherInfo_ == null) ? ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance() : this.watcherInfo_;
        }
        
        @Override
        public ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder getWatcherInfoOrBuilder() {
            return this.getWatcherInfo();
        }
        
        @Override
        public int getActivityId() {
            return this.activityId_;
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
            if (this.activityId_ != 0) {
                output.writeUInt32(1, this.activityId_);
            }
            if (this.watcherInfo_ != null) {
                output.writeMessage(2, this.getWatcherInfo());
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
            if (this.activityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.activityId_);
            }
            if (this.watcherInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getWatcherInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityUpdateWatcherNotify)) {
                return super.equals(obj);
            }
            final ActivityUpdateWatcherNotify other = (ActivityUpdateWatcherNotify)obj;
            return this.hasWatcherInfo() == other.hasWatcherInfo() && (!this.hasWatcherInfo() || this.getWatcherInfo().equals(other.getWatcherInfo())) && this.getActivityId() == other.getActivityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasWatcherInfo()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getWatcherInfo().hashCode();
            }
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getActivityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ActivityUpdateWatcherNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ActivityUpdateWatcherNotify.PARSER.parseFrom(data);
        }
        
        public static ActivityUpdateWatcherNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityUpdateWatcherNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityUpdateWatcherNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ActivityUpdateWatcherNotify.PARSER.parseFrom(data);
        }
        
        public static ActivityUpdateWatcherNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityUpdateWatcherNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityUpdateWatcherNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ActivityUpdateWatcherNotify.PARSER.parseFrom(data);
        }
        
        public static ActivityUpdateWatcherNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityUpdateWatcherNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityUpdateWatcherNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityUpdateWatcherNotify.PARSER, input);
        }
        
        public static ActivityUpdateWatcherNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityUpdateWatcherNotify.PARSER, input, extensionRegistry);
        }
        
        public static ActivityUpdateWatcherNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityUpdateWatcherNotify.PARSER, input);
        }
        
        public static ActivityUpdateWatcherNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityUpdateWatcherNotify.PARSER, input, extensionRegistry);
        }
        
        public static ActivityUpdateWatcherNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityUpdateWatcherNotify.PARSER, input);
        }
        
        public static ActivityUpdateWatcherNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityUpdateWatcherNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ActivityUpdateWatcherNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ActivityUpdateWatcherNotify prototype) {
            return ActivityUpdateWatcherNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ActivityUpdateWatcherNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ActivityUpdateWatcherNotify getDefaultInstance() {
            return ActivityUpdateWatcherNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ActivityUpdateWatcherNotify> parser() {
            return ActivityUpdateWatcherNotify.PARSER;
        }
        
        @Override
        public Parser<ActivityUpdateWatcherNotify> getParserForType() {
            return ActivityUpdateWatcherNotify.PARSER;
        }
        
        @Override
        public ActivityUpdateWatcherNotify getDefaultInstanceForType() {
            return ActivityUpdateWatcherNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ActivityUpdateWatcherNotify();
            PARSER = new AbstractParser<ActivityUpdateWatcherNotify>() {
                @Override
                public ActivityUpdateWatcherNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ActivityUpdateWatcherNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActivityUpdateWatcherNotifyOrBuilder
        {
            private ActivityWatcherInfoOuterClass.ActivityWatcherInfo watcherInfo_;
            private SingleFieldBuilderV3<ActivityWatcherInfoOuterClass.ActivityWatcherInfo, ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder, ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder> watcherInfoBuilder_;
            private int activityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ActivityUpdateWatcherNotifyOuterClass.internal_static_ActivityUpdateWatcherNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ActivityUpdateWatcherNotifyOuterClass.internal_static_ActivityUpdateWatcherNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityUpdateWatcherNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ActivityUpdateWatcherNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.watcherInfoBuilder_ == null) {
                    this.watcherInfo_ = null;
                }
                else {
                    this.watcherInfo_ = null;
                    this.watcherInfoBuilder_ = null;
                }
                this.activityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ActivityUpdateWatcherNotifyOuterClass.internal_static_ActivityUpdateWatcherNotify_descriptor;
            }
            
            @Override
            public ActivityUpdateWatcherNotify getDefaultInstanceForType() {
                return ActivityUpdateWatcherNotify.getDefaultInstance();
            }
            
            @Override
            public ActivityUpdateWatcherNotify build() {
                final ActivityUpdateWatcherNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ActivityUpdateWatcherNotify buildPartial() {
                final ActivityUpdateWatcherNotify result = new ActivityUpdateWatcherNotify(this);
                if (this.watcherInfoBuilder_ == null) {
                    result.watcherInfo_ = this.watcherInfo_;
                }
                else {
                    result.watcherInfo_ = this.watcherInfoBuilder_.build();
                }
                result.activityId_ = this.activityId_;
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
                if (other instanceof ActivityUpdateWatcherNotify) {
                    return this.mergeFrom((ActivityUpdateWatcherNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ActivityUpdateWatcherNotify other) {
                if (other == ActivityUpdateWatcherNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.hasWatcherInfo()) {
                    this.mergeWatcherInfo(other.getWatcherInfo());
                }
                if (other.getActivityId() != 0) {
                    this.setActivityId(other.getActivityId());
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
                ActivityUpdateWatcherNotify parsedMessage = null;
                try {
                    parsedMessage = ActivityUpdateWatcherNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ActivityUpdateWatcherNotify)e.getUnfinishedMessage();
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
            public boolean hasWatcherInfo() {
                return this.watcherInfoBuilder_ != null || this.watcherInfo_ != null;
            }
            
            @Override
            public ActivityWatcherInfoOuterClass.ActivityWatcherInfo getWatcherInfo() {
                if (this.watcherInfoBuilder_ == null) {
                    return (this.watcherInfo_ == null) ? ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance() : this.watcherInfo_;
                }
                return this.watcherInfoBuilder_.getMessage();
            }
            
            public Builder setWatcherInfo(final ActivityWatcherInfoOuterClass.ActivityWatcherInfo value) {
                if (this.watcherInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.watcherInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.watcherInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setWatcherInfo(final ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder builderForValue) {
                if (this.watcherInfoBuilder_ == null) {
                    this.watcherInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.watcherInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeWatcherInfo(final ActivityWatcherInfoOuterClass.ActivityWatcherInfo value) {
                if (this.watcherInfoBuilder_ == null) {
                    if (this.watcherInfo_ != null) {
                        this.watcherInfo_ = ActivityWatcherInfoOuterClass.ActivityWatcherInfo.newBuilder(this.watcherInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.watcherInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.watcherInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearWatcherInfo() {
                if (this.watcherInfoBuilder_ == null) {
                    this.watcherInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.watcherInfo_ = null;
                    this.watcherInfoBuilder_ = null;
                }
                return this;
            }
            
            public ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder getWatcherInfoBuilder() {
                this.onChanged();
                return this.getWatcherInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder getWatcherInfoOrBuilder() {
                if (this.watcherInfoBuilder_ != null) {
                    return this.watcherInfoBuilder_.getMessageOrBuilder();
                }
                return (this.watcherInfo_ == null) ? ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance() : this.watcherInfo_;
            }
            
            private SingleFieldBuilderV3<ActivityWatcherInfoOuterClass.ActivityWatcherInfo, ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder, ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder> getWatcherInfoFieldBuilder() {
                if (this.watcherInfoBuilder_ == null) {
                    this.watcherInfoBuilder_ = new SingleFieldBuilderV3<ActivityWatcherInfoOuterClass.ActivityWatcherInfo, ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder, ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder>(this.getWatcherInfo(), this.getParentForChildren(), this.isClean());
                    this.watcherInfo_ = null;
                }
                return this.watcherInfoBuilder_;
            }
            
            @Override
            public int getActivityId() {
                return this.activityId_;
            }
            
            public Builder setActivityId(final int value) {
                this.activityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearActivityId() {
                this.activityId_ = 0;
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
    
    public interface ActivityUpdateWatcherNotifyOrBuilder extends MessageOrBuilder
    {
        boolean hasWatcherInfo();
        
        ActivityWatcherInfoOuterClass.ActivityWatcherInfo getWatcherInfo();
        
        ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder getWatcherInfoOrBuilder();
        
        int getActivityId();
    }
}
