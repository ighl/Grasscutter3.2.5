// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
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

public final class ActivityWatcherInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ActivityWatcherInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActivityWatcherInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ActivityWatcherInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ActivityWatcherInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019ActivityWatcherInfo.proto\"p\n\u0013ActivityWatcherInfo\u0012\u0017\n\u000fis_taken_reward\u0018\b \u0001(\b\u0012\u0014\n\fcur_progress\u0018\u0002 \u0001(\r\u0012\u0016\n\u000etotal_progress\u0018\u0004 \u0001(\r\u0012\u0012\n\nwatcher_id\u0018\u0005 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ActivityWatcherInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ActivityWatcherInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ActivityWatcherInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_descriptor, new String[] { "IsTakenReward", "CurProgress", "TotalProgress", "WatcherId" });
    }
    
    public static final class ActivityWatcherInfo extends GeneratedMessageV3 implements ActivityWatcherInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_TAKEN_REWARD_FIELD_NUMBER = 8;
        private boolean isTakenReward_;
        public static final int CUR_PROGRESS_FIELD_NUMBER = 2;
        private int curProgress_;
        public static final int TOTAL_PROGRESS_FIELD_NUMBER = 4;
        private int totalProgress_;
        public static final int WATCHER_ID_FIELD_NUMBER = 5;
        private int watcherId_;
        private byte memoizedIsInitialized;
        private static final ActivityWatcherInfo DEFAULT_INSTANCE;
        private static final Parser<ActivityWatcherInfo> PARSER;
        
        private ActivityWatcherInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ActivityWatcherInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ActivityWatcherInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ActivityWatcherInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.curProgress_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.totalProgress_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.watcherId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.isTakenReward_ = input.readBool();
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
            return ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityWatcherInfo.class, Builder.class);
        }
        
        @Override
        public boolean getIsTakenReward() {
            return this.isTakenReward_;
        }
        
        @Override
        public int getCurProgress() {
            return this.curProgress_;
        }
        
        @Override
        public int getTotalProgress() {
            return this.totalProgress_;
        }
        
        @Override
        public int getWatcherId() {
            return this.watcherId_;
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
            if (this.curProgress_ != 0) {
                output.writeUInt32(2, this.curProgress_);
            }
            if (this.totalProgress_ != 0) {
                output.writeUInt32(4, this.totalProgress_);
            }
            if (this.watcherId_ != 0) {
                output.writeUInt32(5, this.watcherId_);
            }
            if (this.isTakenReward_) {
                output.writeBool(8, this.isTakenReward_);
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
            if (this.curProgress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.curProgress_);
            }
            if (this.totalProgress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.totalProgress_);
            }
            if (this.watcherId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.watcherId_);
            }
            if (this.isTakenReward_) {
                size += CodedOutputStream.computeBoolSize(8, this.isTakenReward_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityWatcherInfo)) {
                return super.equals(obj);
            }
            final ActivityWatcherInfo other = (ActivityWatcherInfo)obj;
            return this.getIsTakenReward() == other.getIsTakenReward() && this.getCurProgress() == other.getCurProgress() && this.getTotalProgress() == other.getTotalProgress() && this.getWatcherId() == other.getWatcherId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + Internal.hashBoolean(this.getIsTakenReward());
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getCurProgress();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getTotalProgress();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getWatcherId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ActivityWatcherInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ActivityWatcherInfo.PARSER.parseFrom(data);
        }
        
        public static ActivityWatcherInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityWatcherInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityWatcherInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ActivityWatcherInfo.PARSER.parseFrom(data);
        }
        
        public static ActivityWatcherInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityWatcherInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityWatcherInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ActivityWatcherInfo.PARSER.parseFrom(data);
        }
        
        public static ActivityWatcherInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityWatcherInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityWatcherInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityWatcherInfo.PARSER, input);
        }
        
        public static ActivityWatcherInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityWatcherInfo.PARSER, input, extensionRegistry);
        }
        
        public static ActivityWatcherInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityWatcherInfo.PARSER, input);
        }
        
        public static ActivityWatcherInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityWatcherInfo.PARSER, input, extensionRegistry);
        }
        
        public static ActivityWatcherInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityWatcherInfo.PARSER, input);
        }
        
        public static ActivityWatcherInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityWatcherInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ActivityWatcherInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ActivityWatcherInfo prototype) {
            return ActivityWatcherInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ActivityWatcherInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ActivityWatcherInfo getDefaultInstance() {
            return ActivityWatcherInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ActivityWatcherInfo> parser() {
            return ActivityWatcherInfo.PARSER;
        }
        
        @Override
        public Parser<ActivityWatcherInfo> getParserForType() {
            return ActivityWatcherInfo.PARSER;
        }
        
        @Override
        public ActivityWatcherInfo getDefaultInstanceForType() {
            return ActivityWatcherInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ActivityWatcherInfo();
            PARSER = new AbstractParser<ActivityWatcherInfo>() {
                @Override
                public ActivityWatcherInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ActivityWatcherInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActivityWatcherInfoOrBuilder
        {
            private boolean isTakenReward_;
            private int curProgress_;
            private int totalProgress_;
            private int watcherId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityWatcherInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ActivityWatcherInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isTakenReward_ = false;
                this.curProgress_ = 0;
                this.totalProgress_ = 0;
                this.watcherId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_descriptor;
            }
            
            @Override
            public ActivityWatcherInfo getDefaultInstanceForType() {
                return ActivityWatcherInfo.getDefaultInstance();
            }
            
            @Override
            public ActivityWatcherInfo build() {
                final ActivityWatcherInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ActivityWatcherInfo buildPartial() {
                final ActivityWatcherInfo result = new ActivityWatcherInfo(this);
                result.isTakenReward_ = this.isTakenReward_;
                result.curProgress_ = this.curProgress_;
                result.totalProgress_ = this.totalProgress_;
                result.watcherId_ = this.watcherId_;
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
                if (other instanceof ActivityWatcherInfo) {
                    return this.mergeFrom((ActivityWatcherInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ActivityWatcherInfo other) {
                if (other == ActivityWatcherInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsTakenReward()) {
                    this.setIsTakenReward(other.getIsTakenReward());
                }
                if (other.getCurProgress() != 0) {
                    this.setCurProgress(other.getCurProgress());
                }
                if (other.getTotalProgress() != 0) {
                    this.setTotalProgress(other.getTotalProgress());
                }
                if (other.getWatcherId() != 0) {
                    this.setWatcherId(other.getWatcherId());
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
                ActivityWatcherInfo parsedMessage = null;
                try {
                    parsedMessage = ActivityWatcherInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ActivityWatcherInfo)e.getUnfinishedMessage();
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
            public boolean getIsTakenReward() {
                return this.isTakenReward_;
            }
            
            public Builder setIsTakenReward(final boolean value) {
                this.isTakenReward_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsTakenReward() {
                this.isTakenReward_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurProgress() {
                return this.curProgress_;
            }
            
            public Builder setCurProgress(final int value) {
                this.curProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurProgress() {
                this.curProgress_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTotalProgress() {
                return this.totalProgress_;
            }
            
            public Builder setTotalProgress(final int value) {
                this.totalProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTotalProgress() {
                this.totalProgress_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWatcherId() {
                return this.watcherId_;
            }
            
            public Builder setWatcherId(final int value) {
                this.watcherId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWatcherId() {
                this.watcherId_ = 0;
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
    
    public interface ActivityWatcherInfoOrBuilder extends MessageOrBuilder
    {
        boolean getIsTakenReward();
        
        int getCurProgress();
        
        int getTotalProgress();
        
        int getWatcherId();
    }
}
