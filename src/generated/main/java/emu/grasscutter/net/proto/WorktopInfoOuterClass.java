// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class WorktopInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_WorktopInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WorktopInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WorktopInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WorktopInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011WorktopInfo.proto\"@\n\u000bWorktopInfo\u0012\u0013\n\u000boption_list\u0018\u0001 \u0003(\r\u0012\u001c\n\u0014is_guest_can_operate\u0018\u0002 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WorktopInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WorktopInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WorktopInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WorktopInfoOuterClass.internal_static_WorktopInfo_descriptor, new String[] { "OptionList", "IsGuestCanOperate" });
    }
    
    public static final class WorktopInfo extends GeneratedMessageV3 implements WorktopInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int OPTION_LIST_FIELD_NUMBER = 1;
        private Internal.IntList optionList_;
        private int optionListMemoizedSerializedSize;
        public static final int IS_GUEST_CAN_OPERATE_FIELD_NUMBER = 2;
        private boolean isGuestCanOperate_;
        private byte memoizedIsInitialized;
        private static final WorktopInfo DEFAULT_INSTANCE;
        private static final Parser<WorktopInfo> PARSER;
        
        private WorktopInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.optionListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private WorktopInfo() {
            this.optionListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.optionList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WorktopInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WorktopInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.optionList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.optionList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.optionList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.optionList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 16: {
                            this.isGuestCanOperate_ = input.readBool();
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
                    this.optionList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WorktopInfoOuterClass.internal_static_WorktopInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WorktopInfoOuterClass.internal_static_WorktopInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WorktopInfo.class, Builder.class);
        }
        
        @Override
        public List<Integer> getOptionListList() {
            return this.optionList_;
        }
        
        @Override
        public int getOptionListCount() {
            return this.optionList_.size();
        }
        
        @Override
        public int getOptionList(final int index) {
            return this.optionList_.getInt(index);
        }
        
        @Override
        public boolean getIsGuestCanOperate() {
            return this.isGuestCanOperate_;
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
            this.getSerializedSize();
            if (this.getOptionListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.optionListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.optionList_.size(); ++i) {
                output.writeUInt32NoTag(this.optionList_.getInt(i));
            }
            if (this.isGuestCanOperate_) {
                output.writeBool(2, this.isGuestCanOperate_);
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
            int dataSize = 0;
            for (int i = 0; i < this.optionList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.optionList_.getInt(i));
            }
            size += dataSize;
            if (!this.getOptionListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.optionListMemoizedSerializedSize = dataSize;
            if (this.isGuestCanOperate_) {
                size += CodedOutputStream.computeBoolSize(2, this.isGuestCanOperate_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WorktopInfo)) {
                return super.equals(obj);
            }
            final WorktopInfo other = (WorktopInfo)obj;
            return this.getOptionListList().equals(other.getOptionListList()) && this.getIsGuestCanOperate() == other.getIsGuestCanOperate() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getOptionListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getOptionListList().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getIsGuestCanOperate());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WorktopInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WorktopInfo.PARSER.parseFrom(data);
        }
        
        public static WorktopInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorktopInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorktopInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WorktopInfo.PARSER.parseFrom(data);
        }
        
        public static WorktopInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorktopInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorktopInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WorktopInfo.PARSER.parseFrom(data);
        }
        
        public static WorktopInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorktopInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorktopInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorktopInfo.PARSER, input);
        }
        
        public static WorktopInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorktopInfo.PARSER, input, extensionRegistry);
        }
        
        public static WorktopInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorktopInfo.PARSER, input);
        }
        
        public static WorktopInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorktopInfo.PARSER, input, extensionRegistry);
        }
        
        public static WorktopInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorktopInfo.PARSER, input);
        }
        
        public static WorktopInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorktopInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WorktopInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WorktopInfo prototype) {
            return WorktopInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WorktopInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WorktopInfo getDefaultInstance() {
            return WorktopInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<WorktopInfo> parser() {
            return WorktopInfo.PARSER;
        }
        
        @Override
        public Parser<WorktopInfo> getParserForType() {
            return WorktopInfo.PARSER;
        }
        
        @Override
        public WorktopInfo getDefaultInstanceForType() {
            return WorktopInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WorktopInfo();
            PARSER = new AbstractParser<WorktopInfo>() {
                @Override
                public WorktopInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WorktopInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WorktopInfoOrBuilder
        {
            private int bitField0_;
            private Internal.IntList optionList_;
            private boolean isGuestCanOperate_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WorktopInfoOuterClass.internal_static_WorktopInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WorktopInfoOuterClass.internal_static_WorktopInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WorktopInfo.class, Builder.class);
            }
            
            private Builder() {
                this.optionList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.optionList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WorktopInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.optionList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.isGuestCanOperate_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WorktopInfoOuterClass.internal_static_WorktopInfo_descriptor;
            }
            
            @Override
            public WorktopInfo getDefaultInstanceForType() {
                return WorktopInfo.getDefaultInstance();
            }
            
            @Override
            public WorktopInfo build() {
                final WorktopInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WorktopInfo buildPartial() {
                final WorktopInfo result = new WorktopInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.optionList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.optionList_ = this.optionList_;
                result.isGuestCanOperate_ = this.isGuestCanOperate_;
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
                if (other instanceof WorktopInfo) {
                    return this.mergeFrom((WorktopInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WorktopInfo other) {
                if (other == WorktopInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.optionList_.isEmpty()) {
                    if (this.optionList_.isEmpty()) {
                        this.optionList_ = other.optionList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureOptionListIsMutable();
                        this.optionList_.addAll(other.optionList_);
                    }
                    this.onChanged();
                }
                if (other.getIsGuestCanOperate()) {
                    this.setIsGuestCanOperate(other.getIsGuestCanOperate());
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
                WorktopInfo parsedMessage = null;
                try {
                    parsedMessage = WorktopInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WorktopInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureOptionListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.optionList_ = GeneratedMessageV3.mutableCopy(this.optionList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getOptionListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.optionList_) : this.optionList_;
            }
            
            @Override
            public int getOptionListCount() {
                return this.optionList_.size();
            }
            
            @Override
            public int getOptionList(final int index) {
                return this.optionList_.getInt(index);
            }
            
            public Builder setOptionList(final int index, final int value) {
                this.ensureOptionListIsMutable();
                this.optionList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addOptionList(final int value) {
                this.ensureOptionListIsMutable();
                this.optionList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllOptionList(final Iterable<? extends Integer> values) {
                this.ensureOptionListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.optionList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearOptionList() {
                this.optionList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsGuestCanOperate() {
                return this.isGuestCanOperate_;
            }
            
            public Builder setIsGuestCanOperate(final boolean value) {
                this.isGuestCanOperate_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsGuestCanOperate() {
                this.isGuestCanOperate_ = false;
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
    
    public interface WorktopInfoOrBuilder extends MessageOrBuilder
    {
        List<Integer> getOptionListList();
        
        int getOptionListCount();
        
        int getOptionList(final int p0);
        
        boolean getIsGuestCanOperate();
    }
}
