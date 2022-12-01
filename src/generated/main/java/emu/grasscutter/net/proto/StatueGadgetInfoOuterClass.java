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

public final class StatueGadgetInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_StatueGadgetInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_StatueGadgetInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private StatueGadgetInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return StatueGadgetInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016StatueGadgetInfo.proto\"2\n\u0010StatueGadgetInfo\u0012\u001e\n\u0016opened_statue_uid_list\u0018\u0001 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        StatueGadgetInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_StatueGadgetInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_StatueGadgetInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(StatueGadgetInfoOuterClass.internal_static_StatueGadgetInfo_descriptor, new String[] { "OpenedStatueUidList" });
    }
    
    public static final class StatueGadgetInfo extends GeneratedMessageV3 implements StatueGadgetInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int OPENED_STATUE_UID_LIST_FIELD_NUMBER = 1;
        private Internal.IntList openedStatueUidList_;
        private int openedStatueUidListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final StatueGadgetInfo DEFAULT_INSTANCE;
        private static final Parser<StatueGadgetInfo> PARSER;
        
        private StatueGadgetInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.openedStatueUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private StatueGadgetInfo() {
            this.openedStatueUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.openedStatueUidList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new StatueGadgetInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private StatueGadgetInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.openedStatueUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.openedStatueUidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.openedStatueUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.openedStatueUidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                    this.openedStatueUidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return StatueGadgetInfoOuterClass.internal_static_StatueGadgetInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return StatueGadgetInfoOuterClass.internal_static_StatueGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(StatueGadgetInfo.class, Builder.class);
        }
        
        @Override
        public List<Integer> getOpenedStatueUidListList() {
            return this.openedStatueUidList_;
        }
        
        @Override
        public int getOpenedStatueUidListCount() {
            return this.openedStatueUidList_.size();
        }
        
        @Override
        public int getOpenedStatueUidList(final int index) {
            return this.openedStatueUidList_.getInt(index);
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
            if (this.getOpenedStatueUidListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.openedStatueUidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.openedStatueUidList_.size(); ++i) {
                output.writeUInt32NoTag(this.openedStatueUidList_.getInt(i));
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
            for (int i = 0; i < this.openedStatueUidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.openedStatueUidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getOpenedStatueUidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.openedStatueUidListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StatueGadgetInfo)) {
                return super.equals(obj);
            }
            final StatueGadgetInfo other = (StatueGadgetInfo)obj;
            return this.getOpenedStatueUidListList().equals(other.getOpenedStatueUidListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getOpenedStatueUidListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getOpenedStatueUidListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static StatueGadgetInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return StatueGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static StatueGadgetInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StatueGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StatueGadgetInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return StatueGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static StatueGadgetInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StatueGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StatueGadgetInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return StatueGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static StatueGadgetInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return StatueGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static StatueGadgetInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StatueGadgetInfo.PARSER, input);
        }
        
        public static StatueGadgetInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StatueGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static StatueGadgetInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(StatueGadgetInfo.PARSER, input);
        }
        
        public static StatueGadgetInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(StatueGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static StatueGadgetInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StatueGadgetInfo.PARSER, input);
        }
        
        public static StatueGadgetInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(StatueGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return StatueGadgetInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final StatueGadgetInfo prototype) {
            return StatueGadgetInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == StatueGadgetInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static StatueGadgetInfo getDefaultInstance() {
            return StatueGadgetInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<StatueGadgetInfo> parser() {
            return StatueGadgetInfo.PARSER;
        }
        
        @Override
        public Parser<StatueGadgetInfo> getParserForType() {
            return StatueGadgetInfo.PARSER;
        }
        
        @Override
        public StatueGadgetInfo getDefaultInstanceForType() {
            return StatueGadgetInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new StatueGadgetInfo();
            PARSER = new AbstractParser<StatueGadgetInfo>() {
                @Override
                public StatueGadgetInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new StatueGadgetInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StatueGadgetInfoOrBuilder
        {
            private int bitField0_;
            private Internal.IntList openedStatueUidList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return StatueGadgetInfoOuterClass.internal_static_StatueGadgetInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return StatueGadgetInfoOuterClass.internal_static_StatueGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(StatueGadgetInfo.class, Builder.class);
            }
            
            private Builder() {
                this.openedStatueUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.openedStatueUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (StatueGadgetInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.openedStatueUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return StatueGadgetInfoOuterClass.internal_static_StatueGadgetInfo_descriptor;
            }
            
            @Override
            public StatueGadgetInfo getDefaultInstanceForType() {
                return StatueGadgetInfo.getDefaultInstance();
            }
            
            @Override
            public StatueGadgetInfo build() {
                final StatueGadgetInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public StatueGadgetInfo buildPartial() {
                final StatueGadgetInfo result = new StatueGadgetInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.openedStatueUidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.openedStatueUidList_ = this.openedStatueUidList_;
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
                if (other instanceof StatueGadgetInfo) {
                    return this.mergeFrom((StatueGadgetInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final StatueGadgetInfo other) {
                if (other == StatueGadgetInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.openedStatueUidList_.isEmpty()) {
                    if (this.openedStatueUidList_.isEmpty()) {
                        this.openedStatueUidList_ = other.openedStatueUidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureOpenedStatueUidListIsMutable();
                        this.openedStatueUidList_.addAll(other.openedStatueUidList_);
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
                StatueGadgetInfo parsedMessage = null;
                try {
                    parsedMessage = StatueGadgetInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (StatueGadgetInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureOpenedStatueUidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.openedStatueUidList_ = GeneratedMessageV3.mutableCopy(this.openedStatueUidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getOpenedStatueUidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.openedStatueUidList_) : this.openedStatueUidList_;
            }
            
            @Override
            public int getOpenedStatueUidListCount() {
                return this.openedStatueUidList_.size();
            }
            
            @Override
            public int getOpenedStatueUidList(final int index) {
                return this.openedStatueUidList_.getInt(index);
            }
            
            public Builder setOpenedStatueUidList(final int index, final int value) {
                this.ensureOpenedStatueUidListIsMutable();
                this.openedStatueUidList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addOpenedStatueUidList(final int value) {
                this.ensureOpenedStatueUidListIsMutable();
                this.openedStatueUidList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllOpenedStatueUidList(final Iterable<? extends Integer> values) {
                this.ensureOpenedStatueUidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.openedStatueUidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearOpenedStatueUidList() {
                this.openedStatueUidList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface StatueGadgetInfoOrBuilder extends MessageOrBuilder
    {
        List<Integer> getOpenedStatueUidListList();
        
        int getOpenedStatueUidListCount();
        
        int getOpenedStatueUidList(final int p0);
    }
}
