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

public final class ReliquaryOuterClass
{
    private static final Descriptors.Descriptor internal_static_Reliquary_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Reliquary_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ReliquaryOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ReliquaryOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000fReliquary.proto\"q\n\tReliquary\u0012\r\n\u0005level\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003exp\u0018\u0002 \u0001(\r\u0012\u0015\n\rpromote_level\u0018\u0003 \u0001(\r\u0012\u0014\n\fmain_prop_id\u0018\u0004 \u0001(\r\u0012\u001b\n\u0013append_prop_id_list\u0018\u0005 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ReliquaryOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_Reliquary_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Reliquary_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ReliquaryOuterClass.internal_static_Reliquary_descriptor, new String[] { "Level", "Exp", "PromoteLevel", "MainPropId", "AppendPropIdList" });
    }
    
    public static final class Reliquary extends GeneratedMessageV3 implements ReliquaryOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LEVEL_FIELD_NUMBER = 1;
        private int level_;
        public static final int EXP_FIELD_NUMBER = 2;
        private int exp_;
        public static final int PROMOTE_LEVEL_FIELD_NUMBER = 3;
        private int promoteLevel_;
        public static final int MAIN_PROP_ID_FIELD_NUMBER = 4;
        private int mainPropId_;
        public static final int APPEND_PROP_ID_LIST_FIELD_NUMBER = 5;
        private Internal.IntList appendPropIdList_;
        private int appendPropIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final Reliquary DEFAULT_INSTANCE;
        private static final Parser<Reliquary> PARSER;
        
        private Reliquary(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.appendPropIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private Reliquary() {
            this.appendPropIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.appendPropIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Reliquary();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Reliquary(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.exp_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.promoteLevel_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.mainPropId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.appendPropIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.appendPropIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 42: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.appendPropIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.appendPropIdList_.addInt(input.readUInt32());
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
                    this.appendPropIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ReliquaryOuterClass.internal_static_Reliquary_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ReliquaryOuterClass.internal_static_Reliquary_fieldAccessorTable.ensureFieldAccessorsInitialized(Reliquary.class, Builder.class);
        }
        
        @Override
        public int getLevel() {
            return this.level_;
        }
        
        @Override
        public int getExp() {
            return this.exp_;
        }
        
        @Override
        public int getPromoteLevel() {
            return this.promoteLevel_;
        }
        
        @Override
        public int getMainPropId() {
            return this.mainPropId_;
        }
        
        @Override
        public List<Integer> getAppendPropIdListList() {
            return this.appendPropIdList_;
        }
        
        @Override
        public int getAppendPropIdListCount() {
            return this.appendPropIdList_.size();
        }
        
        @Override
        public int getAppendPropIdList(final int index) {
            return this.appendPropIdList_.getInt(index);
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
            if (this.level_ != 0) {
                output.writeUInt32(1, this.level_);
            }
            if (this.exp_ != 0) {
                output.writeUInt32(2, this.exp_);
            }
            if (this.promoteLevel_ != 0) {
                output.writeUInt32(3, this.promoteLevel_);
            }
            if (this.mainPropId_ != 0) {
                output.writeUInt32(4, this.mainPropId_);
            }
            if (this.getAppendPropIdListList().size() > 0) {
                output.writeUInt32NoTag(42);
                output.writeUInt32NoTag(this.appendPropIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.appendPropIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.appendPropIdList_.getInt(i));
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
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.level_);
            }
            if (this.exp_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.exp_);
            }
            if (this.promoteLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.promoteLevel_);
            }
            if (this.mainPropId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.mainPropId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.appendPropIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.appendPropIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getAppendPropIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.appendPropIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Reliquary)) {
                return super.equals(obj);
            }
            final Reliquary other = (Reliquary)obj;
            return this.getLevel() == other.getLevel() && this.getExp() == other.getExp() && this.getPromoteLevel() == other.getPromoteLevel() && this.getMainPropId() == other.getMainPropId() && this.getAppendPropIdListList().equals(other.getAppendPropIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getLevel();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getExp();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getPromoteLevel();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getMainPropId();
            if (this.getAppendPropIdListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getAppendPropIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Reliquary parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Reliquary.PARSER.parseFrom(data);
        }
        
        public static Reliquary parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Reliquary.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Reliquary parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Reliquary.PARSER.parseFrom(data);
        }
        
        public static Reliquary parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Reliquary.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Reliquary parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Reliquary.PARSER.parseFrom(data);
        }
        
        public static Reliquary parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Reliquary.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Reliquary parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Reliquary.PARSER, input);
        }
        
        public static Reliquary parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Reliquary.PARSER, input, extensionRegistry);
        }
        
        public static Reliquary parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Reliquary.PARSER, input);
        }
        
        public static Reliquary parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Reliquary.PARSER, input, extensionRegistry);
        }
        
        public static Reliquary parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Reliquary.PARSER, input);
        }
        
        public static Reliquary parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Reliquary.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Reliquary.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Reliquary prototype) {
            return Reliquary.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Reliquary.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Reliquary getDefaultInstance() {
            return Reliquary.DEFAULT_INSTANCE;
        }
        
        public static Parser<Reliquary> parser() {
            return Reliquary.PARSER;
        }
        
        @Override
        public Parser<Reliquary> getParserForType() {
            return Reliquary.PARSER;
        }
        
        @Override
        public Reliquary getDefaultInstanceForType() {
            return Reliquary.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Reliquary();
            PARSER = new AbstractParser<Reliquary>() {
                @Override
                public Reliquary parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Reliquary(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReliquaryOrBuilder
        {
            private int bitField0_;
            private int level_;
            private int exp_;
            private int promoteLevel_;
            private int mainPropId_;
            private Internal.IntList appendPropIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ReliquaryOuterClass.internal_static_Reliquary_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ReliquaryOuterClass.internal_static_Reliquary_fieldAccessorTable.ensureFieldAccessorsInitialized(Reliquary.class, Builder.class);
            }
            
            private Builder() {
                this.appendPropIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.appendPropIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Reliquary.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.level_ = 0;
                this.exp_ = 0;
                this.promoteLevel_ = 0;
                this.mainPropId_ = 0;
                this.appendPropIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ReliquaryOuterClass.internal_static_Reliquary_descriptor;
            }
            
            @Override
            public Reliquary getDefaultInstanceForType() {
                return Reliquary.getDefaultInstance();
            }
            
            @Override
            public Reliquary build() {
                final Reliquary result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Reliquary buildPartial() {
                final Reliquary result = new Reliquary(this);
                final int from_bitField0_ = this.bitField0_;
                result.level_ = this.level_;
                result.exp_ = this.exp_;
                result.promoteLevel_ = this.promoteLevel_;
                result.mainPropId_ = this.mainPropId_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.appendPropIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.appendPropIdList_ = this.appendPropIdList_;
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
                if (other instanceof Reliquary) {
                    return this.mergeFrom((Reliquary)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Reliquary other) {
                if (other == Reliquary.getDefaultInstance()) {
                    return this;
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
                }
                if (other.getExp() != 0) {
                    this.setExp(other.getExp());
                }
                if (other.getPromoteLevel() != 0) {
                    this.setPromoteLevel(other.getPromoteLevel());
                }
                if (other.getMainPropId() != 0) {
                    this.setMainPropId(other.getMainPropId());
                }
                if (!other.appendPropIdList_.isEmpty()) {
                    if (this.appendPropIdList_.isEmpty()) {
                        this.appendPropIdList_ = other.appendPropIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureAppendPropIdListIsMutable();
                        this.appendPropIdList_.addAll(other.appendPropIdList_);
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
                Reliquary parsedMessage = null;
                try {
                    parsedMessage = Reliquary.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Reliquary)e.getUnfinishedMessage();
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
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getExp() {
                return this.exp_;
            }
            
            public Builder setExp(final int value) {
                this.exp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExp() {
                this.exp_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPromoteLevel() {
                return this.promoteLevel_;
            }
            
            public Builder setPromoteLevel(final int value) {
                this.promoteLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPromoteLevel() {
                this.promoteLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMainPropId() {
                return this.mainPropId_;
            }
            
            public Builder setMainPropId(final int value) {
                this.mainPropId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMainPropId() {
                this.mainPropId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureAppendPropIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.appendPropIdList_ = GeneratedMessageV3.mutableCopy(this.appendPropIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getAppendPropIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.appendPropIdList_) : this.appendPropIdList_;
            }
            
            @Override
            public int getAppendPropIdListCount() {
                return this.appendPropIdList_.size();
            }
            
            @Override
            public int getAppendPropIdList(final int index) {
                return this.appendPropIdList_.getInt(index);
            }
            
            public Builder setAppendPropIdList(final int index, final int value) {
                this.ensureAppendPropIdListIsMutable();
                this.appendPropIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addAppendPropIdList(final int value) {
                this.ensureAppendPropIdListIsMutable();
                this.appendPropIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllAppendPropIdList(final Iterable<? extends Integer> values) {
                this.ensureAppendPropIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.appendPropIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearAppendPropIdList() {
                this.appendPropIdList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface ReliquaryOrBuilder extends MessageOrBuilder
    {
        int getLevel();
        
        int getExp();
        
        int getPromoteLevel();
        
        int getMainPropId();
        
        List<Integer> getAppendPropIdListList();
        
        int getAppendPropIdListCount();
        
        int getAppendPropIdList(final int p0);
    }
}
