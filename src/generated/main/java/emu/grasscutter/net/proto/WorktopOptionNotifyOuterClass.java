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

public final class WorktopOptionNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_WorktopOptionNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WorktopOptionNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WorktopOptionNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WorktopOptionNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019WorktopOptionNotify.proto\"D\n\u0013WorktopOptionNotify\u0012\u0018\n\u0010gadget_entity_id\u0018\u000b \u0001(\r\u0012\u0013\n\u000boption_list\u0018\b \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WorktopOptionNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WorktopOptionNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WorktopOptionNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WorktopOptionNotifyOuterClass.internal_static_WorktopOptionNotify_descriptor, new String[] { "GadgetEntityId", "OptionList" });
    }
    
    public static final class WorktopOptionNotify extends GeneratedMessageV3 implements WorktopOptionNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 11;
        private int gadgetEntityId_;
        public static final int OPTION_LIST_FIELD_NUMBER = 8;
        private Internal.IntList optionList_;
        private int optionListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final WorktopOptionNotify DEFAULT_INSTANCE;
        private static final Parser<WorktopOptionNotify> PARSER;
        
        private WorktopOptionNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.optionListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private WorktopOptionNotify() {
            this.optionListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.optionList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WorktopOptionNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WorktopOptionNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.optionList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.optionList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 66: {
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
                        case 88: {
                            this.gadgetEntityId_ = input.readUInt32();
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
            return WorktopOptionNotifyOuterClass.internal_static_WorktopOptionNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WorktopOptionNotifyOuterClass.internal_static_WorktopOptionNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WorktopOptionNotify.class, Builder.class);
        }
        
        @Override
        public int getGadgetEntityId() {
            return this.gadgetEntityId_;
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
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(this.optionListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.optionList_.size(); ++i) {
                output.writeUInt32NoTag(this.optionList_.getInt(i));
            }
            if (this.gadgetEntityId_ != 0) {
                output.writeUInt32(11, this.gadgetEntityId_);
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
            if (this.gadgetEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.gadgetEntityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WorktopOptionNotify)) {
                return super.equals(obj);
            }
            final WorktopOptionNotify other = (WorktopOptionNotify)obj;
            return this.getGadgetEntityId() == other.getGadgetEntityId() && this.getOptionListList().equals(other.getOptionListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getGadgetEntityId();
            if (this.getOptionListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getOptionListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WorktopOptionNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WorktopOptionNotify.PARSER.parseFrom(data);
        }
        
        public static WorktopOptionNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorktopOptionNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorktopOptionNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WorktopOptionNotify.PARSER.parseFrom(data);
        }
        
        public static WorktopOptionNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorktopOptionNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorktopOptionNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WorktopOptionNotify.PARSER.parseFrom(data);
        }
        
        public static WorktopOptionNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorktopOptionNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorktopOptionNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorktopOptionNotify.PARSER, input);
        }
        
        public static WorktopOptionNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorktopOptionNotify.PARSER, input, extensionRegistry);
        }
        
        public static WorktopOptionNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorktopOptionNotify.PARSER, input);
        }
        
        public static WorktopOptionNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorktopOptionNotify.PARSER, input, extensionRegistry);
        }
        
        public static WorktopOptionNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorktopOptionNotify.PARSER, input);
        }
        
        public static WorktopOptionNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorktopOptionNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WorktopOptionNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WorktopOptionNotify prototype) {
            return WorktopOptionNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WorktopOptionNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WorktopOptionNotify getDefaultInstance() {
            return WorktopOptionNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<WorktopOptionNotify> parser() {
            return WorktopOptionNotify.PARSER;
        }
        
        @Override
        public Parser<WorktopOptionNotify> getParserForType() {
            return WorktopOptionNotify.PARSER;
        }
        
        @Override
        public WorktopOptionNotify getDefaultInstanceForType() {
            return WorktopOptionNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WorktopOptionNotify();
            PARSER = new AbstractParser<WorktopOptionNotify>() {
                @Override
                public WorktopOptionNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WorktopOptionNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WorktopOptionNotifyOrBuilder
        {
            private int bitField0_;
            private int gadgetEntityId_;
            private Internal.IntList optionList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WorktopOptionNotifyOuterClass.internal_static_WorktopOptionNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WorktopOptionNotifyOuterClass.internal_static_WorktopOptionNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WorktopOptionNotify.class, Builder.class);
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
                if (WorktopOptionNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.gadgetEntityId_ = 0;
                this.optionList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WorktopOptionNotifyOuterClass.internal_static_WorktopOptionNotify_descriptor;
            }
            
            @Override
            public WorktopOptionNotify getDefaultInstanceForType() {
                return WorktopOptionNotify.getDefaultInstance();
            }
            
            @Override
            public WorktopOptionNotify build() {
                final WorktopOptionNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WorktopOptionNotify buildPartial() {
                final WorktopOptionNotify result = new WorktopOptionNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.gadgetEntityId_ = this.gadgetEntityId_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.optionList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.optionList_ = this.optionList_;
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
                if (other instanceof WorktopOptionNotify) {
                    return this.mergeFrom((WorktopOptionNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WorktopOptionNotify other) {
                if (other == WorktopOptionNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getGadgetEntityId() != 0) {
                    this.setGadgetEntityId(other.getGadgetEntityId());
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
                WorktopOptionNotify parsedMessage = null;
                try {
                    parsedMessage = WorktopOptionNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WorktopOptionNotify)e.getUnfinishedMessage();
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
            public int getGadgetEntityId() {
                return this.gadgetEntityId_;
            }
            
            public Builder setGadgetEntityId(final int value) {
                this.gadgetEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGadgetEntityId() {
                this.gadgetEntityId_ = 0;
                this.onChanged();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface WorktopOptionNotifyOrBuilder extends MessageOrBuilder
    {
        int getGadgetEntityId();
        
        List<Integer> getOptionListList();
        
        int getOptionListCount();
        
        int getOptionList(final int p0);
    }
}
