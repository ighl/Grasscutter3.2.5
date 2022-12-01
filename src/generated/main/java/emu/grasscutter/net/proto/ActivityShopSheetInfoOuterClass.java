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

public final class ActivityShopSheetInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_ActivityShopSheetInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ActivityShopSheetInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ActivityShopSheetInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ActivityShopSheetInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bActivityShopSheetInfo.proto\"O\n\u0015ActivityShopSheetInfo\u0012\u0010\n\bend_time\u0018\u0001 \u0001(\r\u0012\u0012\n\nbegin_time\u0018\f \u0001(\r\u0012\u0010\n\bsheet_id\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ActivityShopSheetInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ActivityShopSheetInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ActivityShopSheetInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ActivityShopSheetInfoOuterClass.internal_static_ActivityShopSheetInfo_descriptor, new String[] { "EndTime", "BeginTime", "SheetId" });
    }
    
    public static final class ActivityShopSheetInfo extends GeneratedMessageV3 implements ActivityShopSheetInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int END_TIME_FIELD_NUMBER = 1;
        private int endTime_;
        public static final int BEGIN_TIME_FIELD_NUMBER = 12;
        private int beginTime_;
        public static final int SHEET_ID_FIELD_NUMBER = 2;
        private int sheetId_;
        private byte memoizedIsInitialized;
        private static final ActivityShopSheetInfo DEFAULT_INSTANCE;
        private static final Parser<ActivityShopSheetInfo> PARSER;
        
        private ActivityShopSheetInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ActivityShopSheetInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ActivityShopSheetInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ActivityShopSheetInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.endTime_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.sheetId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.beginTime_ = input.readUInt32();
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
            return ActivityShopSheetInfoOuterClass.internal_static_ActivityShopSheetInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ActivityShopSheetInfoOuterClass.internal_static_ActivityShopSheetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityShopSheetInfo.class, Builder.class);
        }
        
        @Override
        public int getEndTime() {
            return this.endTime_;
        }
        
        @Override
        public int getBeginTime() {
            return this.beginTime_;
        }
        
        @Override
        public int getSheetId() {
            return this.sheetId_;
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
            if (this.endTime_ != 0) {
                output.writeUInt32(1, this.endTime_);
            }
            if (this.sheetId_ != 0) {
                output.writeUInt32(2, this.sheetId_);
            }
            if (this.beginTime_ != 0) {
                output.writeUInt32(12, this.beginTime_);
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
            if (this.endTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.endTime_);
            }
            if (this.sheetId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.sheetId_);
            }
            if (this.beginTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.beginTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityShopSheetInfo)) {
                return super.equals(obj);
            }
            final ActivityShopSheetInfo other = (ActivityShopSheetInfo)obj;
            return this.getEndTime() == other.getEndTime() && this.getBeginTime() == other.getBeginTime() && this.getSheetId() == other.getSheetId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getEndTime();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getBeginTime();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getSheetId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ActivityShopSheetInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ActivityShopSheetInfo.PARSER.parseFrom(data);
        }
        
        public static ActivityShopSheetInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityShopSheetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityShopSheetInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ActivityShopSheetInfo.PARSER.parseFrom(data);
        }
        
        public static ActivityShopSheetInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityShopSheetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityShopSheetInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ActivityShopSheetInfo.PARSER.parseFrom(data);
        }
        
        public static ActivityShopSheetInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ActivityShopSheetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ActivityShopSheetInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityShopSheetInfo.PARSER, input);
        }
        
        public static ActivityShopSheetInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityShopSheetInfo.PARSER, input, extensionRegistry);
        }
        
        public static ActivityShopSheetInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityShopSheetInfo.PARSER, input);
        }
        
        public static ActivityShopSheetInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ActivityShopSheetInfo.PARSER, input, extensionRegistry);
        }
        
        public static ActivityShopSheetInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityShopSheetInfo.PARSER, input);
        }
        
        public static ActivityShopSheetInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ActivityShopSheetInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ActivityShopSheetInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ActivityShopSheetInfo prototype) {
            return ActivityShopSheetInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ActivityShopSheetInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ActivityShopSheetInfo getDefaultInstance() {
            return ActivityShopSheetInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<ActivityShopSheetInfo> parser() {
            return ActivityShopSheetInfo.PARSER;
        }
        
        @Override
        public Parser<ActivityShopSheetInfo> getParserForType() {
            return ActivityShopSheetInfo.PARSER;
        }
        
        @Override
        public ActivityShopSheetInfo getDefaultInstanceForType() {
            return ActivityShopSheetInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ActivityShopSheetInfo();
            PARSER = new AbstractParser<ActivityShopSheetInfo>() {
                @Override
                public ActivityShopSheetInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ActivityShopSheetInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActivityShopSheetInfoOrBuilder
        {
            private int endTime_;
            private int beginTime_;
            private int sheetId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ActivityShopSheetInfoOuterClass.internal_static_ActivityShopSheetInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ActivityShopSheetInfoOuterClass.internal_static_ActivityShopSheetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ActivityShopSheetInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ActivityShopSheetInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.endTime_ = 0;
                this.beginTime_ = 0;
                this.sheetId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ActivityShopSheetInfoOuterClass.internal_static_ActivityShopSheetInfo_descriptor;
            }
            
            @Override
            public ActivityShopSheetInfo getDefaultInstanceForType() {
                return ActivityShopSheetInfo.getDefaultInstance();
            }
            
            @Override
            public ActivityShopSheetInfo build() {
                final ActivityShopSheetInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ActivityShopSheetInfo buildPartial() {
                final ActivityShopSheetInfo result = new ActivityShopSheetInfo(this);
                result.endTime_ = this.endTime_;
                result.beginTime_ = this.beginTime_;
                result.sheetId_ = this.sheetId_;
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
                if (other instanceof ActivityShopSheetInfo) {
                    return this.mergeFrom((ActivityShopSheetInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ActivityShopSheetInfo other) {
                if (other == ActivityShopSheetInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getEndTime() != 0) {
                    this.setEndTime(other.getEndTime());
                }
                if (other.getBeginTime() != 0) {
                    this.setBeginTime(other.getBeginTime());
                }
                if (other.getSheetId() != 0) {
                    this.setSheetId(other.getSheetId());
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
                ActivityShopSheetInfo parsedMessage = null;
                try {
                    parsedMessage = ActivityShopSheetInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ActivityShopSheetInfo)e.getUnfinishedMessage();
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
            public int getEndTime() {
                return this.endTime_;
            }
            
            public Builder setEndTime(final int value) {
                this.endTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEndTime() {
                this.endTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBeginTime() {
                return this.beginTime_;
            }
            
            public Builder setBeginTime(final int value) {
                this.beginTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBeginTime() {
                this.beginTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSheetId() {
                return this.sheetId_;
            }
            
            public Builder setSheetId(final int value) {
                this.sheetId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSheetId() {
                this.sheetId_ = 0;
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
    
    public interface ActivityShopSheetInfoOrBuilder extends MessageOrBuilder
    {
        int getEndTime();
        
        int getBeginTime();
        
        int getSheetId();
    }
}
