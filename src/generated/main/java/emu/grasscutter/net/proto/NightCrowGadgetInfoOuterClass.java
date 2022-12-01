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

public final class NightCrowGadgetInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_NightCrowGadgetInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NightCrowGadgetInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private NightCrowGadgetInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return NightCrowGadgetInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019NightCrowGadgetInfo.proto\",\n\u0013NightCrowGadgetInfo\u0012\u0015\n\rargument_list\u0018\u0001 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        NightCrowGadgetInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_NightCrowGadgetInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_NightCrowGadgetInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(NightCrowGadgetInfoOuterClass.internal_static_NightCrowGadgetInfo_descriptor, new String[] { "ArgumentList" });
    }
    
    public static final class NightCrowGadgetInfo extends GeneratedMessageV3 implements NightCrowGadgetInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ARGUMENT_LIST_FIELD_NUMBER = 1;
        private Internal.IntList argumentList_;
        private int argumentListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final NightCrowGadgetInfo DEFAULT_INSTANCE;
        private static final Parser<NightCrowGadgetInfo> PARSER;
        
        private NightCrowGadgetInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.argumentListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private NightCrowGadgetInfo() {
            this.argumentListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.argumentList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new NightCrowGadgetInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private NightCrowGadgetInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.argumentList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.argumentList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.argumentList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.argumentList_.addInt(input.readUInt32());
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
                    this.argumentList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return NightCrowGadgetInfoOuterClass.internal_static_NightCrowGadgetInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return NightCrowGadgetInfoOuterClass.internal_static_NightCrowGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(NightCrowGadgetInfo.class, Builder.class);
        }
        
        @Override
        public List<Integer> getArgumentListList() {
            return this.argumentList_;
        }
        
        @Override
        public int getArgumentListCount() {
            return this.argumentList_.size();
        }
        
        @Override
        public int getArgumentList(final int index) {
            return this.argumentList_.getInt(index);
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
            if (this.getArgumentListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.argumentListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.argumentList_.size(); ++i) {
                output.writeUInt32NoTag(this.argumentList_.getInt(i));
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
            for (int i = 0; i < this.argumentList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.argumentList_.getInt(i));
            }
            size += dataSize;
            if (!this.getArgumentListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.argumentListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NightCrowGadgetInfo)) {
                return super.equals(obj);
            }
            final NightCrowGadgetInfo other = (NightCrowGadgetInfo)obj;
            return this.getArgumentListList().equals(other.getArgumentListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getArgumentListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getArgumentListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static NightCrowGadgetInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return NightCrowGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static NightCrowGadgetInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NightCrowGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NightCrowGadgetInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return NightCrowGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static NightCrowGadgetInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NightCrowGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NightCrowGadgetInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return NightCrowGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static NightCrowGadgetInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NightCrowGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NightCrowGadgetInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NightCrowGadgetInfo.PARSER, input);
        }
        
        public static NightCrowGadgetInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NightCrowGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static NightCrowGadgetInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(NightCrowGadgetInfo.PARSER, input);
        }
        
        public static NightCrowGadgetInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(NightCrowGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static NightCrowGadgetInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NightCrowGadgetInfo.PARSER, input);
        }
        
        public static NightCrowGadgetInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NightCrowGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return NightCrowGadgetInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final NightCrowGadgetInfo prototype) {
            return NightCrowGadgetInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == NightCrowGadgetInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static NightCrowGadgetInfo getDefaultInstance() {
            return NightCrowGadgetInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<NightCrowGadgetInfo> parser() {
            return NightCrowGadgetInfo.PARSER;
        }
        
        @Override
        public Parser<NightCrowGadgetInfo> getParserForType() {
            return NightCrowGadgetInfo.PARSER;
        }
        
        @Override
        public NightCrowGadgetInfo getDefaultInstanceForType() {
            return NightCrowGadgetInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new NightCrowGadgetInfo();
            PARSER = new AbstractParser<NightCrowGadgetInfo>() {
                @Override
                public NightCrowGadgetInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new NightCrowGadgetInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NightCrowGadgetInfoOrBuilder
        {
            private int bitField0_;
            private Internal.IntList argumentList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return NightCrowGadgetInfoOuterClass.internal_static_NightCrowGadgetInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return NightCrowGadgetInfoOuterClass.internal_static_NightCrowGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(NightCrowGadgetInfo.class, Builder.class);
            }
            
            private Builder() {
                this.argumentList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.argumentList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (NightCrowGadgetInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.argumentList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return NightCrowGadgetInfoOuterClass.internal_static_NightCrowGadgetInfo_descriptor;
            }
            
            @Override
            public NightCrowGadgetInfo getDefaultInstanceForType() {
                return NightCrowGadgetInfo.getDefaultInstance();
            }
            
            @Override
            public NightCrowGadgetInfo build() {
                final NightCrowGadgetInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public NightCrowGadgetInfo buildPartial() {
                final NightCrowGadgetInfo result = new NightCrowGadgetInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.argumentList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.argumentList_ = this.argumentList_;
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
                if (other instanceof NightCrowGadgetInfo) {
                    return this.mergeFrom((NightCrowGadgetInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final NightCrowGadgetInfo other) {
                if (other == NightCrowGadgetInfo.getDefaultInstance()) {
                    return this;
                }
                if (!other.argumentList_.isEmpty()) {
                    if (this.argumentList_.isEmpty()) {
                        this.argumentList_ = other.argumentList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureArgumentListIsMutable();
                        this.argumentList_.addAll(other.argumentList_);
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
                NightCrowGadgetInfo parsedMessage = null;
                try {
                    parsedMessage = NightCrowGadgetInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (NightCrowGadgetInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureArgumentListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.argumentList_ = GeneratedMessageV3.mutableCopy(this.argumentList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getArgumentListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.argumentList_) : this.argumentList_;
            }
            
            @Override
            public int getArgumentListCount() {
                return this.argumentList_.size();
            }
            
            @Override
            public int getArgumentList(final int index) {
                return this.argumentList_.getInt(index);
            }
            
            public Builder setArgumentList(final int index, final int value) {
                this.ensureArgumentListIsMutable();
                this.argumentList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addArgumentList(final int value) {
                this.ensureArgumentListIsMutable();
                this.argumentList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllArgumentList(final Iterable<? extends Integer> values) {
                this.ensureArgumentListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.argumentList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearArgumentList() {
                this.argumentList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface NightCrowGadgetInfoOrBuilder extends MessageOrBuilder
    {
        List<Integer> getArgumentListList();
        
        int getArgumentListCount();
        
        int getArgumentList(final int p0);
    }
}
